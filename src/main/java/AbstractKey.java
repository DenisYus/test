import java.util.Comparator;
import java.util.List;

public abstract class AbstractKey implements Comparator<String> {

    protected List<String> values;


    public AbstractKey() {
        this.values = createValues();
    }

    protected abstract List<String> createValues();


    protected abstract List<String> getValue();
}
