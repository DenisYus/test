import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserService extends AbstractKey {


    @Override
    protected List<String> createValues() {
        return values;
    }

    @Override
    public List<String> getValue() {
        List<String> values = new ArrayList<>();
        values.add("http://192.186.10.1");
        values.add("http://192.186.10.2");
        values.add("http://192.186.10.3");
        return values;
    }

    @Override
    public int compare(String o1, String o2) {
        String regex = "\\.([0-9]+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher1 = pattern.matcher(o1);
        Matcher matcher2 = pattern.matcher(o2);

        int num1 = matcher1.find() ? Integer.parseInt(matcher1.group(1)) : -1;
        int num2 = matcher2.find() ? Integer.parseInt(matcher2.group(1)) : -1;

        return Integer.compare(num1, num2);
    }
}
