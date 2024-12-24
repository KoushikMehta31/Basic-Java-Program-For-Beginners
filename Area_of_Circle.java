import java.util.Scanner;

public class Area_of_Circle {
    public static void main(String[] args) {
        double pi = 3.14;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius of a circle: ");
        int r = sc.nextInt();
        double area = pi * r * r;
        System.out.println(area);
    }
}
