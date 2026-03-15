import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary: ");
        double sal = sc.nextInt();
        System.out.print("Enter years of service: ");
        double yos = sc.nextInt();
        double bonus = 0;
        if (yos > 5) {
            bonus = ((5.0/100)*sal);
        } else {
            bonus = 0;
        }
        System.out.println("Bonus: " + bonus);
    }
}
