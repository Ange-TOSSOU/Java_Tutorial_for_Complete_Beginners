package Java.Java_Tutorial_for_Complete_Beginners.Chapter_7;

public class Application {
    public static void main(String[] args) {
        String text = "Hello";
        String blank = " ";
        String name = "Bob";
        String greeting = text + blank + name;

        System.out.println(greeting);
        System.out.println("Hello" + " " + "Bob");

        int myInt = 7;
        System.out.println("My integer is: " + myInt);

        double myDouble = 7.8;
        System.out.println("My number is: " + myDouble);
    }
}
