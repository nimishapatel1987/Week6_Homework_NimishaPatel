package homework_week_6;
//add two binary numbers

import java.util.Scanner;


public class Class16 {
    private static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.println("Enter first and second numbers = ");
        long b1 = sc.nextLong();
        long b2 = sc.nextLong();
        int i = 0, carry = 0;
        int[] sum = new int[10];

        while (b1 != 0 ||  b2 !=0){
            sum[i++] = (int)((b1 % 10 + b2 % 10 + carry) % 2);
            carry    = (int)((b1 % 10 + b2 % 10 + carry) / 2);
            b1 /= 10;
            b2 /= 10;
        }
        if(carry != 0){
            sum[i++] = carry;
        }
        --i;
        System.out.println("\n sum of two binary number ");
        while(i >= 0){
            //System.out.println(sum[i--]);
            System.out.print(sum[i--]);
        }
        System.out.println();


    }
}
