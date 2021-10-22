//Q10. WAP to read words from the keyboard until the word done is entered. For each word except done, report whether its first character is equal to its last character. For the required loop, use a
//a : while statement
//b : do-while statement

package Ques10;

import java.util.Scanner;

public class UsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        while (!str.equals("done")) {
            if (str.charAt(0) == str.charAt(str.length() - 1)) {
                System.out.println("First character is equal to its last character of the word: "+str);
            } else {
                System.out.println("First character is Not equal to its last character of the word: "+str);
            }
            str = sc.next();
        }
    }
}
