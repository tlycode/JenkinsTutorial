import org.w3c.dom.ls.LSInput;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Calculator calculator = new Calculator();

        System.out.println("Welcome to the calculator");

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a command:");
            String function = scanner.nextLine();
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            if (function.contains("add")) {
                System.out.println(calculator.add(a, b));
            } else if (function.contains("subtract")) {
                System.out.println(calculator.subtract(a, b));
            } else if (function.contains("multiply")) {
                System.out.println(calculator.multiply(a, b));
            } else if (function.contains("divide")) {
                System.out.println(calculator.divide(a, b));
            } else if (function.contains("fibonacci")) {
                System.out.println(calculator.fibonacciNumberFinder(a));
            } else if (function.contains("binary")) {
                System.out.println(calculator.intToBinaryNumber(a));
            }
            else break;
        }
    }

}
