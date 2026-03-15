import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int[] multiplicationResult = new int[4];
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i-6] = num*i;
        }
        for (int i = 0; i < multiplicationResult.length; i++) {
            System.out.println(num + " * " + (i+6) + " = " + multiplicationResult[i]);
        }
    }
}
