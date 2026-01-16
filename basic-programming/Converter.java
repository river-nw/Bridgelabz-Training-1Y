import java.util.Scanner;

public class Converter{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in kilometres: ");
        int km = sc.nextInt();
        double miles = km * 0.621371f;
        System.out.println("Distance in miles: " + miles);
    }
}