import java.util.List;
import java.util.concurrent.ConcurrentMap;

public class Utils {
    public static <E> List<E> filterByClass(List<E> input, Class<?> clazz){
//        return input.stream().filter(item -> item.getClass() == clazz).toList();
//        return input.stream().filter(item -> clazz.isInstance(item)).toList();
        return input.stream().filter(clazz::isInstance).toList();
    }

    public static <T extends Comparable<T>> long countingRange(List<T> list, T min, T max){
        RangePredicate<T> predicate = new RangePredicate<>(min, max);
        return list.stream().filter(predicate).count();
    }

}
