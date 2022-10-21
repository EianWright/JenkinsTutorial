import java.util.Scanner;

public class Main {
    //Must be able to run the add, subtract, multiply, divide, fibonacciNumberFinder, and intToBinaryNumber in the terminal.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        boolean goOn = true;

        System.out.println("Welcome to the calculator.\nPlease enter a command:");

        while (goOn) {
            String command = scanner.next();

            switch (command) {
                case "add":
                    System.out.println(calculator.add(scanner.nextInt(), scanner.nextInt()));
                    break;
                case "subtract":
                    System.out.println(calculator.subtract(scanner.nextInt(), scanner.nextInt()));
                    break;
                case "multiply":
                    System.out.println(calculator.multiply(scanner.nextInt(), scanner.nextInt()));
                    break;
                case "divide":
                    System.out.println(calculator.divide(scanner.nextInt(), scanner.nextInt()));
                    break;
                case "fibonacci":
                    System.out.println(calculator.fibonacciNumberFinder(scanner.nextInt()));
                    break;
                case "binary":
                    System.out.println(calculator.intToBinaryNumber(scanner.nextInt()));
                    break;
                case "exit":
                    goOn = false;
                    break;
                default:
                    System.out.println("Didn't recognize that command.");
                    break;
            }
        }
    }
}
