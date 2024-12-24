import java.util.*;

public class Factorial_number {
    public static void main(String[] args) {
        int n, fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
