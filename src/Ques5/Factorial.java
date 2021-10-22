//Have the function FirstFactorial(num) take the num parameter being passed and return the factorial of it.

package Ques5;

import java.util.Scanner;

public class Factorial {
    public static int FirstFactorial(int num) {
        int k = 1;
        if (num == 1) {
            return num;
        } else {
            for (int i = 1; i <= num; i++) {
                k *= i;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        System.out.println("Enter your number");
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        System.out.println("Factorial of " + number + " is: " + FirstFactorial(number));
    }
}
