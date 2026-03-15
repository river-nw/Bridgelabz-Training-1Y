import java.util.Scanner;

public class Harry{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter brith year: ");
        int a = sc.nextInt();
        System.out.println("Enter current year: ");
        int b = sc.nextInt();
        int age = b - a;
        System.out.println("Age: " + age);
    }
}