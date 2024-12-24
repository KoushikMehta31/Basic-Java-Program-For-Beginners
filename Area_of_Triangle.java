import java.util.Scanner;

public class Area_of_Triangle {
    public static void main(String[] args) {
        double sp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Enter third number: ");
        int c = sc.nextInt();
        sp = a + b + c / 2;
        double area = Math.sqrt(sp * (sp - a) * (sp - b) * (sp - c));
        System.out.println(area);
    }
}
