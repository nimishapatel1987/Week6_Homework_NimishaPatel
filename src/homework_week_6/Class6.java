package homework_week_6;

//Enter any radius value of the circle and find out the area
//next double method reads user input and assign it to radius

import java.util.Scanner;

public class Class6 {

    public static void main(String[] args) {

        double radius,area;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of the circle");
        radius = input.nextDouble();
        input.close();

        area = Math.PI * radius * radius;

        System.out.println("Area of the Circle is "+area);
    }


}
