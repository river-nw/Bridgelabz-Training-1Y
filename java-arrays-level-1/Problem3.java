import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int[] mul = new int[10];
        for (int i = 0; i < 10; i++) {
            mul[i] = num * (i+1);
        }
        for (int i = 0; i < mul.length; i++) {
            System.out.println(num + " * " + (i+1) + " = " + mul[i]);
        }
    }
}
