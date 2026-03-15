import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int num[] = new int[10];
        int enteredNum = 1;
        int sum = 0;
        while (count < 10 && enteredNum != 0) {
            System.out.print("Enter number: ");
            num[count] = sc.nextInt();
            enteredNum = num[count];
            count++;
        }
        for (int i = 1; i <= num.length; i++) {
            sum += num[(i-1)];
        }
        System.out.println("Sum: " + sum);
    }
}
