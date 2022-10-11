package homework_week_6;

import java.util.Scanner;
//takes 3 numbers as input to calculate
//print of the numbers

public class Class13 {
    public static void main(String[] args) {

        int a,b,c,ave;  double area;
        System.out.println("Enter 3 integer numbers for average");
        Scanner r = new Scanner(System.in);
        a = r.nextInt();
        b = r.nextInt();
        c = r.nextInt();

        ave=(a+b+c)/3;

        System.out.println("Average of 3 numbers "+ ave);
    }

}
