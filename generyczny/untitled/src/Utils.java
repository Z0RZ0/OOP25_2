import java.util.List;

public class Utils {
    public static <E> List<E> filterByClass(List<E> input, Class<?> clazz){
//        return input.stream().filter(item -> item.getClass() == clazz).toList();
//        return input.stream().filter(item -> clazz.isInstance(item)).toList();
        return input.stream().filter(clazz::isInstance).toList();
    }
}
