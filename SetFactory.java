import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Christian12 on 01/09/2016.
 */
public class SetFactory extends AbstractFactory{
    public static final String HASHSET = "HASHSET";
    public static final String TREESET = "TREESET";
    public static final String LINKEDHASHSET = "LINKEDHASHSET";

    @Override
    public <E> Set<E> getSet(String setType) {
        if (setType.equalsIgnoreCase(HASHSET))
            return new HashSet<>();
        if (setType.equalsIgnoreCase(TREESET))
            return new TreeSet<>();
        if (setType.equalsIgnoreCase(LINKEDHASHSET))
            return new LinkedHashSet<>();
            return null;
    }
}
