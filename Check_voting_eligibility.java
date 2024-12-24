import java.util.Scanner;

public class Check_voting_eligibility {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        age = sc.nextInt();
        if (age >= 18) {
            System.out.println("You are Eligibility for voting");
        } else {
            System.out.println("You are not Eligibility for voting");
        }
    }
}
