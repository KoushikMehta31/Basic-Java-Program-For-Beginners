import java.util.Scanner;

public class Area_of_rectangle {
    public static void main(String[] args) {
        int l, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and breadth: ");
        l = sc.nextInt();
        b = sc.nextInt();
        double area = l * b;
        System.out.println(area);
    }
}
