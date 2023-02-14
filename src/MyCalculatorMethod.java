// WB 3 : My calculator
import java.util.Scanner;
public class MyCalculatorMethod {
    public static void main(String[] args) { // main method
        // 1. read in two user inputs num1, num2, print them
        Scanner number = new Scanner(System.in);
        System.out.println("Enter two numbers : ");

        int number1 = number.nextInt();
        int number2 = number.nextInt();

        // 3. call the methods to compute
        System.out.println(number1 + " + " + number2 + " = " + addNum(number1 , number2));
        System.out.println(number1 + " - " + number2 + " = " + subNum(number1 , number2));
        System.out.println(number1 + " x " + number2 + " = " + multiNum(number1 , number2));
        System.out.println(number1 + " / " + number2 + " = " + divNum(number1 , number2));
    }

    // 2. method to add the two numbers, use return keyword
    static int addNum (int a, int b) {
        return a+b;
    }

    // 4. method to subtract two numbers
    static int subNum (int a, int b) {
        return a-b;
    }
    // 5. method to multiply two numbers
    static int multiNum (int a, int b) {
        return a*b;
    }
    // 6. method to divide two numbers
    static int divNum (int a, int b) {
        return a/b;
    }
}