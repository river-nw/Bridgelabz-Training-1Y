import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int i = 0;
        int sum1 = 0;
        int sum2 = num * (num+1)/2;
        if (num > 0) {
            while (i<=num) {
                sum1 += i;
                i++;
            }
            System.out.println("Sum using while loop: " + sum1);
            System.out.println("Sum using formulae: " + sum2);
        }
    }
}
