import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by Pavel Smokorovskiy on 18.04.18
 */

public class MyLimitedSet<T> implements LimitedSet<T> {

    static class Entry<T> {

        T value;
        int counter = -1;

        Entry() {
        }
    }

    //Stores the elements
    private Entry<T>[] array;

    //Maximum initial capacity
    private final int CAPACITY = 10;

    MyLimitedSet() {

        array = new Entry[CAPACITY];

        for (int i = 0; i < array.length; i++) {
            array[i] = new Entry<>();
        }
    }

    Iterator iterator() {
        return Arrays.asList(array).iterator();
    }

    @Override
    public boolean contains(T t) {

        for (Entry<T> entry : array) {
            if (t.equals(entry.value)) {
                entry.counter++;
                return true;
            }
        }

        return false;
    }

    @Override
    public void add(T t) {

        int min = 0;
        int index = 0;
        boolean contains = false;

        for (int i = 0; i < array.length; i++) {
            if (t.equals(array[i].value)) {
                contains = true;
                break;
            } else if (min > array[i].counter) {
                min = array[i].counter;
                System.out.println(array[0].counter);
//                System.out.println("min: " + min);
                index = i;
            }
        }

        if (!contains) {
            array[index].value = t;
            array[index].counter = 0;
        }
    }

    @Override
    public boolean remove(T t) {

        for (int i = 0; i < array.length; i++) {

            if (t.equals(array[i].value)) {
                array[i] = new Entry<>();
                return true;
            }
        }

        return false;
    }

}
