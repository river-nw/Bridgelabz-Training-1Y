import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        for (int i = 6; i <= 9; i++) {
            System.err.println(num + " * " + i + " = " + num*i);
        }
    }
}
