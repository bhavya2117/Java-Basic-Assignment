//Q6. Write a program to find the number of occurrences of the duplicate words in a string and print them?

package Ques7;

import java.util.Scanner;

public class CountCharOccurences {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = s.nextLine();
        System.out.println("Enter the character: ");
        char a = s.next().charAt(0);
        String str1 = Character.toString(a);
        int i = str.length() - str.replace(str1, "").length();
        System.out.print("the occurrences of character " + a + " is: " + i);
    }
}
