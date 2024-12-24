import java.util.Scanner;

public class Count_digit_of_a_number {
    public static void main(String[] args) {
        int n, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number: ");
        n = sc.nextInt();
        while (n > 0) {
            n = n / 10;
            count++;
        }
        System.out.println(count);
    }
}
