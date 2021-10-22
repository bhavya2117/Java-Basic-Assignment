//Q8.Write a program to print your Firstname, LastName & age using static block, static method & static variable respectively
package Ques8;

public class StaticKeyword {
    public static void main(String[] args) {
        System.out.println("Using Static Method");
        StaticKeyword.Mydetails();
        System.out.println("Using Static Variable");
        System.out.println("FirstName: "+Firstname+" LastName: " +Lastname+" Age: "+age);
    }

    static {
        String Firstname="Bhavya";
        String Lastname="Garg";
        int age = 21;
        System.out.println("Using Static Block");
        System.out.println("FirstName: "+Firstname+" LastName: " +Lastname+" Age: "+age);
    }

    static void Mydetails(){
        String Firstname="Bhavya";
        String Lastname="Garg";
        int age = 21;
        System.out.println("FirstName: "+Firstname+" LastName: " +Lastname+" Age: "+age);
    }

    static String Firstname ="Bhavya", Lastname ="Garg";
    static  int age= 21;
}
