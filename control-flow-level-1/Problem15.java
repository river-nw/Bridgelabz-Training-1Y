import java.util.Scanner;

public class Problem15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int i = 1;
        int factorial = 1;
        if (num > 0) {
            while (i<=num) {
                factorial *= i;
                i++;
            }
            System.out.println("Factorial: " + factorial);
        }
    }
}
