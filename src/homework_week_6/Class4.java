package homework_week_6;

//Declare two instance and two static variable
//Declare one instance method
//Declare one static method
//Call all methods inside the print statement
//Declare the main method
//Call both method and run the programme

public class Class4 {
    int a = 10; //instance method
    int b = 20; //instance method
    static int c=10; //static variable
    static int d=10; //static variable

    public static void main(String []args) {
        Class4 obj = new Class4();
        obj.myMethord1();
        myMethord2();
    }
    //instance method
    public void myMethord1(){
        System.out.println(a);
        System.out.println(b);
    }
    //static method
    public static void myMethord2() {
        System.out.println(c);
        System.out.println(d);
    }

}
