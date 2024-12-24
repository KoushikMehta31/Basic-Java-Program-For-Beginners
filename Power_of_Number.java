import java.util.Scanner;

public class Power_of_Number {
    public static void main(String[] args) {
        int n, p;
        int result = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number: ");
        n = sc.nextInt();
        System.out.println("power of number: ");
        p = sc.nextInt();
        for (int i = 1; i <= p; i++) {
            result = result * n;
        }
        System.out.println(result);
    }
}
