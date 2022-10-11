package homework_week_6;
//program to insert any temprature value in degree Fahrenheit and convert to degree Celsius

import java.util.Scanner;

public class Class7 {
    public static void main(String[] args) {

        float fahrenheit, celsius;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Temprature (in Fahrenheit): ");
        fahrenheit = scan.nextFloat();

        celsius = (float) ((fahrenheit-32)*(5/9));

        System.out.println("\nEquivalent Temprature (in Celsius) =" +celsius);
    }
}
