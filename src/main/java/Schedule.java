import java.io.*;
import java.util.List;

public class Schedule implements AddressView {
    private final String NUMBER_FILE_NAME = "number.text";

    @Override
    public void view(List<String> addressOutput) {
        int number = loadNumber();
        System.out.println(addressOutput.get(number));
        number++;
        if (number >= addressOutput.size()) {
            number = 0;
        }
        saveNumber(number);
    }

    private int loadNumber() {
        try (BufferedReader reader = new BufferedReader(new FileReader(NUMBER_FILE_NAME))) {
            String line = reader.readLine();
            if (line != null) {
                return Integer.parseInt(line);
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
        return 0; // Возвращаем 0, если не удалось загрузить число
    }

    private void saveNumber(int number) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(NUMBER_FILE_NAME))) {
            writer.println(number);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
