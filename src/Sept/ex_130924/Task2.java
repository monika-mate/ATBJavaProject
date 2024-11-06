package Sept.ex_130924;

public class Task2 {
    /*Prepare a small calculator, which supports +, - , , / and %(?) - Modulus operator
double a = 34;
double b = 10;
Print - a+b, a-b, ab, a/b, a%b all the outputs.
     */
    public static void main(String[] args) {
        double a = 34;
        double b = 10;
        System.out.printf("addition = %f \n", a+b);
        System.out.printf("sub = %f  \n" , a-b);
        System.out.printf("Modules = %f \n" , a%b);
        System.out.printf("div %f  \n" , a/b);
        System.out.printf("multi %f  \n" , a*b);
    }
}
