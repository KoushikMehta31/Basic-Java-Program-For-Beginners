import java.util.Scanner;

public class Check_number_is_positive_or_negative {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Check number is Positive or Negative");
        System.out.println("Enter any number: ");
        n = sc.nextInt();
        if (n < 0) {
            System.out.println(n + " Negative number");
        } else {
            System.out.println(n + " Postive number");
        }
    }
}
