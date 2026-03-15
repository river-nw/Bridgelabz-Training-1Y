import java.util.Scanner;

public class Problem13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int sum1 = 0;
        int sum2 = num * (num+1)/2;
        if (num > 0) {
            for (int i = 0; i <= num; i++) {
                sum1 += i;
            }
            System.out.println("Sum using while loop: " + sum1);
            System.out.println("Sum using formulae: " + sum2);
        }
    }
}
