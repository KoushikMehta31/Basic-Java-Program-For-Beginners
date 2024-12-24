import java.util.Scanner;

public class Find_factor_of_a_number {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }

        }
    }
}
