import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = sc.nextInt();
        System.out.print("Enter second number: ");
        int second = sc.nextInt();
        System.out.print("Enter operator: ");
        String op = sc.next();
        switch (op) {
            case "+":
                System.out.println(first + " + " + second + " = " + (first+second));
                break;
            case "-":
                System.out.println(first + " - " + second + " = " + (first-second));
                break;
            case "*":
                System.out.println(first + " * " + second + " = " + (first*second));
                break;
            case "/":
                System.out.println(first + " / " + second + " = " + (first/second));
                break;
            default:
                System.out.println("Invalid Operator");
                break;
        }

    }
}
