import java.util.Scanner;

public class Swap_two_number {
    public static void main(String[] args) {
        int temp, a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Before Swaping");
        System.out.println("Enter first number: ");
        a = sc.nextInt();
        System.out.println("Enter second number: ");
        b = sc.nextInt();
        temp = a;
        a = b;
        b = temp;
        System.out.println("After Swaping");
        System.out.println("first number: " + a);
        System.out.println("second number: " + b);
    }
}
