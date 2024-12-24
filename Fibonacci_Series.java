import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        int a = 0, b = 1, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter term: ");
        int term = sc.nextInt();
        for (int i = 1; i < term; i++) {
            System.out.println(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
