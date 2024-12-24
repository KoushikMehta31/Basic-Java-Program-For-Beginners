import java.util.Scanner;

public class Check_number_is_Armstrong_or_not {
    public static void main(String[] args) {
        int n, c, r, amg = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        n = sc.nextInt();
        c = n;
        while (n > 0) {
            r = n % 10;
            amg = (r * r * r) + amg;
            n = n / 10;
        }
        if (amg == c) {
            System.out.println("it is a Armstrong number");
        } else {
            System.out.println("it is not a Armstrong number");

        }
    }
}
