import java.util.ArrayList;

public class Store {
    public static <E> E getLastElement(ArrayList<E> arr) {
        if (arr.isEmpty())
            return null;
        E first = arr.get(arr.size()-1);
        return first;
    }
}
