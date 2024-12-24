import java.util.Scanner;

public class Area_of_Square {
    public static void main(String[] args) {
        int side;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter side of a square: ");
        side = sc.nextInt();
        double area = side * side;
        System.out.println(area);
    }
}
