package Java.Java_Tutorial_for_Complete_Beginners.Chapter_7;

public class Palindrome {

    public static void main(String[] args) {
        String palindrome = "Dot saw I was Tod";

        // Print palindrome
        System.out.println("Original sentence : " + palindrome);

        // Print reversed palindrome
        System.out.print("Reversed sentence : ");
        for (int i = palindrome.length()-1; i >=0; i--) {
            System.out.print(palindrome.charAt(i));
        }
    }

}
