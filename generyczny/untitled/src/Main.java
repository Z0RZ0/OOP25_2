import jdk.jshell.execution.Util;

import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CustomList<Object> list = new CustomList<>();

        //list.getFirst()
        //list.getLast();
        list.addFirst(1);
        list.addLast(2);
        list.addFirst(0);
        list.add(3);

        list.addFirst(1000);
        list.addLast(-10);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        System.out.println("Usuwam: "+list.removeFirst());
        System.out.println("Usuwam: "+list.removeLast());

        System.out.println("First: "+list.getFirst());
        System.out.println("Last: "+list.getLast());
        System.out.println("Rozmiar listy: "+list.size());

        System.out.println("List[0]: "+list.get(0));
        System.out.println("List[3]: "+list.get(3));
        System.out.println("List[2]: "+list.get(2));

        for(Object i : list){
            System.out.println(i);
        }

        list.stream().forEach(System.out::println);

        list.add("hello");
        list.add(1234.15);
        list.addFirst("inny napis");
        System.out.println(list);

        List<Object> strings = Utils.filterByClass(list, String.class);
        List<Object> numbers = Utils.filterByClass(list, Number.class);

        System.out.println("string: "+strings);
        System.out.println("numbers: "+numbers);

        List<Integer> ints = List.of(1, 3, 4, 7, 14, 0, 2);
        List<Double> doubs = List.of(0.0, 1.3, 16.1, 14.6);
        System.out.println("In range: "+ Utils.countingRange(ints, 0, 4));
        System.out.println("In range: "+ Utils.countingRange(doubs, 0.0, 4.0));

        CollectionComparator<List<? extends Number>> comparator = new CollectionComparator<>();
        System.out.println(comparator.compare(ints, doubs));

    }
}