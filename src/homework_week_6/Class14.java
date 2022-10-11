package homework_week_6;

//java program to print the area and perimeter of a rectangle

import java.util.Scanner;

public class Class14 {
    public static void main(String[] args) {

        float len, wid, area;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the Length Rectangle: ");
        len = s.nextFloat();
        System.out.println("Enter the Width Rectangle: ");
        wid = s.nextFloat();
        area = len*wid;
        System.out.println("\nArea = " +area);

        float length, width, perimeter;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Length Rectangle: ");
        length = s.nextFloat();
        System.out.println("Enter the Width Rectangle: ");
        width = s.nextFloat();
        perimeter = (2*length) + (2*width);
        System.out.println("\nPerimiter = " +perimeter);

        System.out.println("Enter the length and width of Rectangle: ");
        float a= s.nextFloat();
        float b= s.nextFloat();

        float ar = a*b;
        float pr = 2*(a+b);
        System.out.println("\nArea = " +ar);
        System.out.println("Perimeter = " +pr);
    }
}
