package homework_week_6;

//multification table of num 8
//expected output
//8x1 = 8
//8x2 = 16
//8x3 = 24
//......
//8x10 = 80

public class Class10 {

    public static void main(String[] args) {
        int num=8, i;
        System.out.println("\n-----Multification Table of 8-----");

        for (i=1; i<10; i++)
        System.out.println(num + "*" + i + "=" + (num * i ));
    }

}
