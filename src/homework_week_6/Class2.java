package homework_week_6;
//Declare two static variables
//Declare one static method
//Call both static variables into the static method inside the print statement
//Declare the Main method
//Call the static method into the Main method and Run the programme

public class Class2 {

    static int a=10; //static variable
    static int b=10; //static variable


    public static void main(String []args) {
        Class2 obj = new Class2();
        obj.myMethord();
    }
    // static method
    public static void myMethord() {
        System.out.println(a);
        System.out.println(b);
    }
}
