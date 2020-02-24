import org.w3c.dom.ls.LSInput;

import java.util.Scanner;

public class Main {
    Calculator calculator = new Calculator();

    public void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the calculator");
        System.out.println("Enter a command:");

        while (true) {
            String function = scanner.nextLine();
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            if (function == "add") {
                calculator.add(a, b);
            } else if (function == "subtract") {
                calculator.subtract(a, b);
            } else if (function == "multiply") {
                calculator.multiply(a, b);
            } else if (function == "divide") {
                calculator.divide(a, b);
            } else if (function == "fibonacci") {
                calculator.fibonacciNumberFinder(a);
            } else if (function == "binary") {
                calculator.intToBinaryNumber(a);
            }
            else break;
        }
    }

}
