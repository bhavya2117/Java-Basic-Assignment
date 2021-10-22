//Q4.Write a Java Program to reverse a string without using String inbuilt function.

package Ques4;

public class ReverseString {
    public static void main(String[] args) {
        String str= "Hello", reverse_string="";
        char ch;
        int i;
        for (i=0; i<str.length(); i++){
            ch =str.charAt(i);
            reverse_string= ch+reverse_string;
        }
        System.out.println(reverse_string);
    }
}
