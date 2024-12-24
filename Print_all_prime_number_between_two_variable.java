import java.util.Scanner;

public class Print_all_prime_number_between_two_variable {
    public static void main(String[] args) {
        int a, b, i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        a = sc.nextInt();
        System.out.println("Enter last number: ");
        b = sc.nextInt();
        for (i = a; i <= b; i++) {
            for (j = 2; j <= i; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (i == j) {
                System.out.println(j);
            }
        }
    }
}
