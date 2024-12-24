import java.util.Scanner;

public class All_even_number_between_0_to_n {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number: ");
        n = sc.nextInt();
        for (int i = 0; i <= n; i += 2) {
            System.out.println(i);
        }
    }
}
