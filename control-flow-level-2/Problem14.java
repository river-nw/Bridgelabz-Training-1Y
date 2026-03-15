import java.util.Scanner;

public class Problem14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        System.out.print("Enter power: ");
        int pow = sc.nextInt();
        int result = 1;
        int i = 1;
        while (i <= pow) {
            result *= num;
            i++;
        }
        System.out.println("Result: " + result);
    }
}
