import java.util.Scanner;

public class Check_number_is_perfect_or_not {
    public static void main(String[] args) {
        int n, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        if (n == sum) {
            System.out.println("it is a perfect number: ");
        } else {
            System.out.println("It is not a perfect number: ");
        }
    }
}
