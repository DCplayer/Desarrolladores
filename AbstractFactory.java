package hdt6;
import java.util.Set;

/**
 * Created by Diego on 01/09/2016.
 * @param <E>
 */
public abstract class AbstractFactory {

    public abstract  <E> Set<E> getSet(String setType);
}
