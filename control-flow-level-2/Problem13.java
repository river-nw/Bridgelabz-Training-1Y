import java.util.Scanner;

public class Problem13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        if (num>0 && num<100) {
            int i = 1;
            while (i<=100) {
                if (i%num==0) {
                    System.out.println(i);
                }
                i++;
            }
        }
    }
}
