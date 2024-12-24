import java.util.Scanner;

public class Total_AND_Average_marks_of_subject {
    public static void main(String[] args) {
        int eng, hind, math, sci, ss;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks of 5 subject: ");
        eng = sc.nextInt();
        hind = sc.nextInt();
        math = sc.nextInt();
        sci = sc.nextInt();
        ss = sc.nextInt();
        double total = eng + hind + math + sci + ss;
        double avg = total / 5;
        System.out.println("total marks: " + total);
        System.out.println("Average: " + avg);
    }
}
