import java.util.Iterator;

/**
 * Created by Pavel Smokorovskiy on 18.04.18
 */

public class Main {

    public static void main(String[] args) {

        MyLimitedSet set = new MyLimitedSet();

        set.add("Значение 1");
        set.add("Значение 2");
        set.add("Значение 3");
        set.add("Значение 4");
        set.add("Значение 5");
        set.add("Значение 6");
        set.add("Значение 7");
        set.add("Значение 8");
        set.add("Значение 9");
        set.add("Значение 10");
        set.contains("Значение 1");
        set.contains("Значение 1");
        set.add("Значение 11");
        set.contains("Значение 11");
        set.add("Значение 12");
        set.remove("Значение 8");
        set.add(100);
        set.add(100);
        set.add(200);
        set.contains(200);
        set.contains(200);
        set.contains(200);

        Iterator<MyLimitedSet.Entry> entries = set.iterator();
        while (entries.hasNext()) {
            MyLimitedSet.Entry entry = entries.next();
            System.out.println("Значение: " + entry.value + "  Количество сравнений: " + entry.counter);
        }
    }
}
