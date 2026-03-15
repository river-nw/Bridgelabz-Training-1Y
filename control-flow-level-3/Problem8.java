import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int temp = num;
        int digits = 0;
        // calculate digits
        while (temp > 0) {
            temp /= 10;
            digits++;
        }
        // calculate sum of digits
        int sum = 0;
        temp = num;
        while (temp > 0) {
            int digit = temp%10;
            sum += digit;
            temp /= 10;
        }

        if (num%sum==0) {
            System.out.println(num + " is a Harshad number.");
        } else {
            System.out.println(num + " is NOT a Harshad number.");
        }
    }
}