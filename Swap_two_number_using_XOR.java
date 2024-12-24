import java.util.Scanner;

public class Swap_two_number_using_XOR {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Before swaping");
        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("Enter Second number: ");
        b = sc.nextInt();
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After Swaping");
        System.out.println("first number: " + a);
        System.out.println("Second number: " + b);
    }
}
