package homework_week_6;
//program to convert a given string into lowercase
//Input "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"
//output "the quick brown fox jumps over the lazy dog"

import java.util.Scanner;

public class Class19 {
    public static void main(String[] args) {

        char chUpper, chLower;
        int ascii;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the String");
        String strUpper = scan.nextLine();

        String strLower = strUpper.toLowerCase();
        System.out.println("\nEquivalent String in Lowercase: \n" +strLower);
    }

}
