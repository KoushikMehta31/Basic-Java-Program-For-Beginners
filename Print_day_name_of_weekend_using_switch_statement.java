import java.util.Scanner;

public class Print_day_name_of_weekend_using_switch_statement {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("0-Sun,1-Mon,2-Tue,3-Wed,4-Thu,5-Fri,6-Sat");
        System.out.println("Enter your choice: ");
        choice = sc.nextInt();
        switch (choice) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Invalid choice, please try again");
                break;
        }
    }
}
