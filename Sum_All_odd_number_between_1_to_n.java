import java.util.Scanner;

public class Sum_All_odd_number_between_1_to_n {
    public static void main(String[] args) {
        int n, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number: ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        System.out.println(sum);
    }
}
