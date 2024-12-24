import java.util.Scanner;

public class Make_Calculator {
    public static void main(String[] args) {
        int a, b;
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("choice 1-sum,2-substraction,3-multification,4-divided");
        System.out.println("Enter your choice: ");

        choice = sc.nextInt();
        System.out.println("Enter two number: ");
        a = sc.nextInt();
        b = sc.nextInt();
        switch (choice) {
            case 1:
                double sum = a + b;
                System.out.println("Sum of two number: " + sum);
                break;
            case 2:
                double sub = a - b;
                System.out.println("Substraction of two number: " + sub);
                break;
            case 3:
                double mult = a * b;
                System.out.println("Multification of two number: " + mult);
                break;
            case 4:
                double div = a / b;
                System.out.println("Divided of two number: " + div);
                break;
            default:
                System.out.println("Enter valid choice");
                break;
        }
    }
}
