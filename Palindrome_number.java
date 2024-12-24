import java.util.Scanner;

public class Palindrome_number {
    public static void main(String[] args) {
        int n, c, r, s = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number: ");
        n = sc.nextInt();
        c = n;
        while (n > 0) {
            r = n % 10;
            s = (s * 10) + r;
            n = n / 10;
        }
        if (c == s) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("not");
        }
    }
}
