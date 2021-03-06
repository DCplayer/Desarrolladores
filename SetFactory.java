package hdt6;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Diego on 01/09/2016.
 * @param <E>
 */
public class SetFactory extends AbstractFactory{
    public static final String HASHSET = "HASHSET";
    public static final String TREESET = "TREESET";
    public static final String LINKEDHASHSET = "LINKEDHASHSET";

    @Override
    public Set getSet(String setType) {
        if (setType.equalsIgnoreCase(HASHSET))
            return new HashSet<Developers>();
        if (setType.equalsIgnoreCase(TREESET))
            return new TreeSet<Developers>();
        if (setType.equalsIgnoreCase(LINKEDHASHSET))
            return new LinkedHashSet<Developers>();
        else
            return null;
    }

    public SetFactory() {
    }
    
    
}
