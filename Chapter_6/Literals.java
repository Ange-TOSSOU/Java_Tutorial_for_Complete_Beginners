package Java.Java_Tutorial_for_Complete_Beginners.Chapter_6;

public class Literals {

    public static void main(String[] args){
        // Integer Literals
        int decVal = 26; // 26 in decimal
        int hexVal = 0x32; // 26 in hexadecimal
        int binVal = 0b11010; // 26 in binary
        long val = 7L;

        System.out.println("DecVal : " + decVal);
        System.out.println("HexVal : " + hexVal);
        System.out.println("BinVal : " + binVal);
        System.out.println("val : " + val);

        // Floating-Point Literals
        double d1 = 123.4;
        double d2 = 123.4d; // equivalent to the previous line
        double d3 = 1.234e2; // d1 in scientific notation
        float f1 = 123.4f;

        System.out.println("D1 : " + d1);
        System.out.println("D2 : " + d2);
        System.out.println("D3 : " + d3);
        System.out.println("F1 : " + f1);
    }
}
