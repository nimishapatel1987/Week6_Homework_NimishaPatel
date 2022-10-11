package homework_week_6;

//convert a decimal number to binary number
//input Decimal number
//expected output Binary number

import java.util.Scanner;

public class Class17 {
    public static void main(String[] args) {
        int decimal, i = 0;
        int[] binary = new int[20];

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Decimal Number: ");
        decimal = scan.nextInt();

        while(decimal != 0){

            binary[i] = decimal%2;
            i++;
            decimal = decimal/2;
        }
        System.out.println("\nEquivalent Binary Value = ");
        for (i=(i-1); i>=0; i--)
            System.out.print(binary[i]);
        //System.out.println(binary[i]);
    }


}
