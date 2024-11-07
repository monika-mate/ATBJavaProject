package Sept.ex_160924;

public class Lab023 {
    public static void main(String[] args) {
        // !, &&, ||
        boolean a = true;
        boolean b = true;
        boolean c = false;
        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println(a || c);  // true
        System.out.println(a && c);  // false
        System.out.println(!a);      // reverse of true

    }
}
