import java.util.Set;

/**
 * Created by Diego on 01/09/2016.
 */
public abstract class AbstractFactory {

    public abstract  <E> Set<E> getSet(String setType);
}
