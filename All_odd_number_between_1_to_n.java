import java.util.Scanner;

public class All_odd_number_between_1_to_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i = i + 2) {
            System.out.println(i);
        }
    }
}
