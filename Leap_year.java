import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter and check number is leap year or not: ");
        n = sc.nextInt();
        if (n % 100 == 0 && n % 400 == 0 || n % 100 != 0 && n % 4 == 0) {
            System.out.println("Leap year");
        } else {
            System.out.println("not leap year");
        }
    }
}
