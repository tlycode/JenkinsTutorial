import java.util.Random;

class Calculator {

    Calculator(){

    }

    int add(int a , int b){
        int result = a + b;
	return result;
    }

    int subtract(int a , int b){
        return a - b;
    }

    int multiply(int a , int b){
        return a * b;
    }

    int divide(int a , int b){
        return a / b;
    }


    /*
    Returns the n'th number in the fibonacci sequence
    https://en.wikipedia.org/wiki/Fibonacci_number
    Example below
    n = x
    0 = 0
    1 = 1
    2 = 1
    3 = 2
    4 = 3
    5 = 5
    .
    .
    .
    etc
     */
    int fibonacciNumberFinder(int n){

        n -= 1;
        if (n < 0)
            return 0;
        else if (n < 2) {
            return 1;
        }
        return fibonacciNumberFinder(n) + fibonacciNumberFinder(n - 1);
    }


    /*
    Returns binary value of the given int number
    The binary number will be stored as a string
    if int a = 0 then this method returns: 0
    if int a = 10 then this method returns: 1010
    if int a = 16 then this method returns: 10000
     */
    String intToBinaryNumber(int n){
        if ( n == 0) {
            return "0";
        }
        int pow = 0;
        while (n > Math.pow(2, pow)) {
            pow++;
        }

        String binaryRepresentation = "";

        for (int i = pow; i >= 0; i--) {
            if (n - Math.pow(2, i) >= 0) {
                binaryRepresentation += "1";
                n = n - (int)Math.pow(2,i);
            }
            else if (i != pow){
                binaryRepresentation += "0";
            }
        }
whats
        return binaryRepresentation;
    }

    /*
    Create a completely unique String identifier for a given string
    Each createdID must contain the string n in its unaltered Form
    if String n = "Jason"
    then the created ID could be = Jasonklfgn3jknnvksdfm - Because it contains the unaltered String n and is unique

    if you run this function twice with the same String input, it must return 2 unique String IDs
     */
    String createUniqueID(String n){
        Random rand = new Random();
        int num;
        String alphabet = "abcdefghijklmnopqrstuvwxyz0123456789";

        for (int i = 0; i < 12; i++) {
            num = rand.nextInt(9000);
            num = num % (alphabet.length() - 1);
            n += alphabet.charAt(num);
        }

        return n;
    }


}
