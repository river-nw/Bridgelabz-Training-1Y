import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int m = sc.nextInt();
        System.out.print("Enter day (1-31): ");
        int d = sc.nextInt();
        System.out.print("Enter year (****): ");
        int y = sc.nextInt();
        int yn = y - (14-m)/12;
        int x = yn + yn/4 - yn/100 + yn/400;
        int mn = m + 12 * ((14-m)/12) - 2;
        int dn = (d + x + 31 * mn / 12) % 7;
        System.out.println("Day of week:" + dn);
    }    
}
