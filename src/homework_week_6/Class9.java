package homework_week_6;

import java.util.Scanner;

public class Class9 {

    public static void main(String[] args) {
        char chUpper, chLower;
        int ascii;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a character in Uppercase: ");
        chUpper = scan.next().charAt(0);

        ascii = chUpper;
        ascii = ascii + 32;
        chLower = (char)ascii;

        System.out.println("\nEquivalent Character in Lowercase = " +chLower);
    }


}
