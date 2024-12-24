import java.util.Scanner;

public class Swap_two_number_without_third_variable {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Before swaping");
        System.out.println("Enter first number");
        a = sc.nextInt();
        System.out.println("Enter first number");
        b = sc.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swaping");
        System.out.println("First  number" + a);
        System.out.println("Second numner" + b);
    }
}
