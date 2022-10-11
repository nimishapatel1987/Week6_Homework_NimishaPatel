package homework_week_6;
//Declare two variable
//Declare one instance method
//Call both instance variables into the instance method inside the print statement
//Declare the Main method
//Call the above instance method into the Main method and Run the programme

public class Class1 {
    int a = 10; //instance method
    int b = 20; //instance method

    public static void main(String []args){
        Class1 obj = new Class1();
        obj.myMethord();
    }
    //instance method
    public void myMethord(){
        System.out.println(a);
        System.out.println(b);
    }

}
