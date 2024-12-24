import java.util.Scanner;

public class Sum_All_even_number_between_1_to_n {
    public static void main(String[] args) {
        int n, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Sum of all even number between 0 to n");
        System.out.println("enter number: ");
        n = sc.nextInt();
        for (int i = 0; i <= n; i += 2) {
            sum += i;
        }
        System.out.println(sum);
    }
}
