package homework_week_6;
//Area of Triangle program//
//input a b c
//1.find semiperimeter
//2.area of triangle

import java.util.Scanner;
//import java.lang.Maths;

public class Class8 {

    public static void main(String[] args) {

        int a,b,c,sp;  double area;
        System.out.println("Enter value for sides of Triangle");
        Scanner r = new Scanner(System.in);
        a = r.nextInt();
        b = r.nextInt();
        c = r.nextInt();

        sp=(a+b+c)/2;

        area = Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
        System.out.println("Area of Triangle "+ area);
    }
}
