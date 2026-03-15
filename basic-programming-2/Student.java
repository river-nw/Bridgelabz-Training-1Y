import java.util.Scanner;

public class Student {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of pens: ");
        int pens = sc.nextInt();
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();
        int quo = pens/students;
        int rem = pens % students;
        System.out.println("Quotient: " + quo);
        System.out.println("Remainder: " + rem);
    }
}
