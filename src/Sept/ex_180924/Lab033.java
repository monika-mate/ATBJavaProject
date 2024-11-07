package Sept.ex_180924;

public class Lab033 {
    public static void main(String[] args) {
        // Type Casting
        // widening
        // narrowing

        byte b = 10;
        int a = b;    // jvm done automatically, it is called implicit casting

        //Narrowing
        int val =300;
        byte bb = (byte) val;
        System.out.println(bb);

        long l = 9876543210l;
        short s = (short) l;
        System.out.println(s);


    }
}
