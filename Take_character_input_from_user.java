import java.util.Scanner;

public class Take_character_input_from_user {
    public static void main(String[] args) {
        char name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = sc.next().charAt(0);
        System.out.println(name);
    }
}
