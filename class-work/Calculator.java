import java.util.Scanner;

public class Calculator {
    public int add(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
    public int mul(int a, int b){
        return a*b;
    }
    public int div(int a, int b){
        return a/b;
    }
    public int mod(int a, int b){
        return a%b;
    }
    public static void main(String[] args) {
        Calculator cl = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.println("Addition: " + cl.add(num1, num2));
        System.out.println("Subtraction: " + cl.sub(num1, num2));
        System.out.println("Multiplication: " + cl.mul(num1, num2));
        System.out.println("Division: " + cl.div(num1, num2));
        System.out.println("Modulus: " + cl.mod(num1, num2));
    }
}
