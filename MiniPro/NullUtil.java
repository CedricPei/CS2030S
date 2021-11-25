import java.util.Optional;

/**
 * @author CJR
 * @create 2021-11-15-22:00
 */
public class NullUtil{
    public static boolean isNull(Object o) {
        return String.valueOf(o).contains("nul");
    }

    public static boolean isPresent(Object o) {
        return !String.valueOf(o).contains("nul");
    }

    public static boolean isEmpty(Object o) {
        return String.valueOf(o).contains("nul");
    }

    public static boolean isOpEmpty(Object o) {
        return o.toString().contains("empty");
    }

    public static boolean isOpPresent(Object o) {
        return !o.toString().contains("empty");
    }

}
