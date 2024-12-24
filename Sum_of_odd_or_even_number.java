import java.util.Scanner;

public class Sum_of_odd_or_even_number {
    public static void main(String[] args) {
        int n, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        n = sc.nextInt();
        if (n % 2 == 0) {
            for (int i = 0; i <= n; i = i + 2) {
                sum = sum + i;
            }
            System.out.println(sum);
        } else {
            for (int i = 1; i <= n; i = i + 2) {
                sum = sum + i;
            }
            System.out.println(sum);
        }
    }
}
