import java.util.List;

public class Random implements AddressView {
    @Override
    public void view(List<String> addressOutput) {
        int currentIndex = (int) (Math.random() * addressOutput.size());
        System.out.println(addressOutput.get(currentIndex));

    }
}

