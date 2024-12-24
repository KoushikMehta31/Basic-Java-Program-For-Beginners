import java.util.Scanner;

public class Convert_UpperToLower_LowerToUpper {
    public static void main(String[] args) {
        char ch, ch1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Convert_UpperToLower_LowerToUpper");
        System.out.println("Enter any Character: ");
        ch = sc.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z') {
            ch1 = Character.toLowerCase(ch);
            System.out.println(ch1);
        } else {
            ch1 = Character.toUpperCase(ch);
            System.out.println(ch1);
        }
    }
}
