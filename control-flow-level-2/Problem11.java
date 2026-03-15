import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        if (num>0 && num<100) {
            for (int i = 1; i <= 100; i++) {
                if (i%num==0) {
                    System.out.println(i);
                }
            }
        }
    }
}
