import java.util.Scanner;

public class Calculate_Tax_of_a_Salary {
    public static void main(String[] args) {
        int salary;
        double tax = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Salary: ");
        salary = sc.nextInt();
        if (salary < 10000) {
            System.out.println(salary + " No Tax");
        } else if (salary > 10000 && salary < 100000) {
            tax = salary * 0.10;
            System.out.println(salary + " " + tax);
        } else {
            tax = salary * 0.20;
            System.out.println(salary + " " + tax);
        }
    }
}
