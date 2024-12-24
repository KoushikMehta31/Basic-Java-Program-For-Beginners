import java.util.Scanner;

public class ASCII_value_of_a_character {
    public static void main(String[] args) {
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any character: ");
        ch = sc.next().charAt(0);
        int a = ch;
        System.out.println(a);
    }
}
