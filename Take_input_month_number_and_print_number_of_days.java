import java.util.Scanner;

public class Take_input_month_number_and_print_number_of_days {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("January - 30 days");
                break;
            case 2:
                System.out.println("February - 28 days");
                break;
            case 3:
                System.out.println("March - 31 days");
                break;
            case 4:
                System.out.println("April - 30 days");
                break;
            case 5:
                System.out.println("May - 31 days");
                break;
            case 6:
                System.out.println("June - 30 days");
                break;
            case 7:
                System.out.println("July - 31 days");
                break;
            case 8:
                System.out.println("August - 31 days");
                break;
            case 9:
                System.out.println("September - 30 days");
                break;
            case 10:
                System.out.println("Octobar - 31 days");
                break;
            case 11:
                System.out.println("November - 30 days");
                break;
            case 12:
                System.out.println("December - 31 days");
                break;

            default:
                System.out.println("Invalid choice, please try again");
                break;
        }
    }
}
