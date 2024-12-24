import java.util.Scanner;

public class Tribonacci_series {
    public static void main(String[] args) {
        int a = 0, b = 1, c = 2, d, term;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter term: ");
        term = sc.nextInt();
        for (int i = 1; i < term; i++) {
            System.out.println(a + " ");
            d = a + b + c;
            a = b;
            b = c;
            c = d;
        }
    }
}
