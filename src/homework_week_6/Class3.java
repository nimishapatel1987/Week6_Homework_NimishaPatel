package homework_week_6;
//Declare one instance and one static variable
//Declare one instance method
//Declare one static method
//Call both instance and static variables into both instance and static methods inside the print statement
//Declare the Main method
//Call both instance and static methods into the Main method and run the programme

public class Class3 {

    int a = 10;//instance
    static String name = "Veeksha";//static

    public static void main(String []args){
        Class3 obj = new Class3();
        obj.myName();
        myCar();
    }
    //instance method
    public void myName(){
        System.out.println(a);
        System.out.println(Class3.name);
    }
    //static method
    public static void myCar(){
        System.out.println("myCar");
    }


}
