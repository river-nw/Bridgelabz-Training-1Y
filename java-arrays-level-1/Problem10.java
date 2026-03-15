import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        String[] fbn = new String[num];
        if (num > 0) {
            for (int i = 0; i < num; i++) {
                int nim = i+1;
                if (nim%3==0 && nim%5!=0) {
                    fbn[i] = "Fizz";
                } else if (nim%5==0 && nim%3!=0){
                    fbn[i] = "Buzz";
                } else if (nim%3==0 && nim%5==0){
                    fbn[i] = "FizzBuzz";
                } else {
                    fbn[i] = String.valueOf(i+1);
                }
            }
            for (int i = 0; i < fbn.length; i++) {
                System.out.println("Postion " + (i+1) + ": " + fbn[i]);
            }
        }

    }
}
