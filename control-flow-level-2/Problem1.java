import java.util.Scanner;

public class Problem1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        if (num > 0) {
            for (int i = 1; i <= num; i++) {
                if (num%2==0){
                    if (i%2==0) {
                        System.out.println(i);
                    }
                } else if (num%2==1) {
                    if (i%2==1) {
                        System.out.println(i);
                    }
                }
            }
        }
    }
}