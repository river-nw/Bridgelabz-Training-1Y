import java.util.Scanner;

public class Problem3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();
        if(num1 > num2 && num1 > num3){
            System.out.println("The first number is the largest of the 3 numbers.");
        } else if (num2 > num1 && num2 > num3){
            System.out.println("The second number is the largest of the 3 numbers.");
        } else if (num3 > num1 && num3 > num2){
            System.out.println("The third number is the largest of the 3 numbers.");
        }
    }
}