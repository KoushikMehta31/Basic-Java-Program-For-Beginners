import java.util.Scanner;

public class Greatest_of_two_number {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any two number: ");
        a = sc.nextInt();
        b = sc.nextInt();
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
