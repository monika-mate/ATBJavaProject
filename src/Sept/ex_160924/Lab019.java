package Sept.ex_160924;

public class Lab019 {

    public static void main(String[] args) {
        // concatenation operator
        // + int + int = math
        // + string + string = combine them == concat
        String first_name = "Monika";
        String last_name = "Mate";
        int a = 10;
        int b = 10;
        System.out.println(first_name + last_name);  // With string + is used a concatenation operator
        System.out.println(first_name + last_name + a+b);//if first one is String it will concat all the value
        System.out.println(a+b + first_name + last_name); // if integer is first then it will use math operation and then concat
    }
}
