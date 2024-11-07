package Sept.ex_180924;

public class Lab036 {
    public static void main(String[] args) {
        int a = 10;
        int result = a++;
        System.out.println(a);
        System.out.println(result);

        /*
        Line no |  exp          |  a
        5       |               | 10
        6       | result        | 10
        7       | result = 10   | 11

         */
    }
}
