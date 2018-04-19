
/**
 * Created by Pavel Smokorovskiy on 18.04.18
 */

public interface LimitedSet<T> {

    void add(final T t);

    boolean remove(final T t);

    boolean contains(final T t);

}
