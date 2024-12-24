import java.util.Scanner;

public class Check_number_is_prime_or_not {
    public static void main(String[] args) {
        int n, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("it is a Prime number");
        } else {
            System.out.println("it is not a Prime number");

        }
    }
}
