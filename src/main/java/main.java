import java.util.ArrayList;
import java.util.List;


public class main {
    public static void main(String[] args) {
        String name = "UserService";
        String view = "Schedule";
        boolean found = false;
        List<AbstractKey> keyList = new ArrayList<>();
        List<AddressView> addressViews = new ArrayList<>();
        addressViews.add(new Random());
        addressViews.add(new Schedule());
        keyList.add(new UserService());
        keyList.add(new UserPerson());

        for (AddressView address : addressViews) {
            if (address.getClass().getSimpleName().equals(view)) {

                for (AbstractKey key : keyList) {
                    if ((key.getClass().getSimpleName().equals(name))) {
                        address.view(key.getValue());
                        found = true;
                    }
                }
                if (!found) {
                    throw new IllegalArgumentException("Такой сервис не найден");
                }
            }
        }
        if (!found) {
            throw new IllegalArgumentException("Такой вывод не найден");
        }
    }
}
