import java.util.Scanner;

public class Check_number_is_divisible_by_5_or_not {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        n = sc.nextInt();
        if (n % 5 == 0) {
            System.out.println(n + " is divisible by 5");
        } else {
            System.out.println(n + " is not divisible by 5");

        }
    }
}
