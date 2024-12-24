import java.util.Scanner;

public class Character_is_vowel_or_not {
    public static void main(String[] args) {
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character: ");
        ch = sc.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("Vowel");
        } else {
            System.out.println("consonent");
        }
    }
}
