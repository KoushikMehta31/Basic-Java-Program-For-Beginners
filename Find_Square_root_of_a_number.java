import java.util.Scanner;

public class Find_Square_root_of_a_number {
    public static void main(String[] args) {
        int n;
        double sq;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number: ");
        n = sc.nextInt();
        sq = Math.sqrt(n);
        System.out.println(sq);
    }
}
