package Sept.ex_180924;

public class Task {
    public static void main(String[] args) {
        float percent = 75.45f;
        int total = (int) percent;
        System.out.println(total);


        int a = 10;
        System.out.println(--a + a-- + a--); //9+9+8=26
        System.out.println(a); //7

        int b = 10;
        System.out.println(--b + b++ + b--); //9+9+10 =28
        System.out.println(b); //9

        int c = 10;
        System.out.println(c-- + c--  + c--); //10+9+8 = 27
        System.out.println(c); //7
    }
}
