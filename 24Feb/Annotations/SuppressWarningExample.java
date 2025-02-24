import java.util.ArrayList;

public class SuppressWarningExample {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Unchecked Warning Suppressed");
        System.out.println(list.get(0));
    }
}
