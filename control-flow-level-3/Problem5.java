import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int digits = 0;
        int temp = num;
        // counting the digits
        while (temp > 0) {
            temp = temp/10;
            digits++;
        }
        // calculating the sum
        int sum = 0;
        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            int power = 1;
            for (int i = 0; i < digits; i++) {
                power *= digit;
            }
            sum += power;
            temp /= 10;
        }

        if (num == sum) {
            System.out.println(num + " is an Angstrom number.");
        } else {
            System.out.println(num + " is NOT an Angstrom number.");
        }
    }
}