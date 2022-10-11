package homework_week_6;

//Programme with addition,substraction,multipication,devision and percentage methods
//all the with parameters and use string concatenation methods

import java.util.Scanner;

public class Class5 {
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        //for the operator
        System.out.print("Input first number: ");
        int num1 = in.nextInt();
        //for the number

        System.out.println("Enter Second number: ");
        int num2 = in.nextInt();
        //for the number

        System.out.println(num1+ "+" +num2+ "=" +(num1+num2));
        //addition between number

        System.out.println(num1+ "-" +num2+ "=" +(num1-num2));
        //substraction between number

        System.out.println(num1+ "x" +num2+ "=" +(num1*num2));
        //multiply between number

        System.out.println(num1+ "/" +num2+ "=" +(num1/num2));
        //devided between number

        System.out.println(num1+ "mod" +num2+ "=" +(num1%num2));
        //percentage between number
    }

}
