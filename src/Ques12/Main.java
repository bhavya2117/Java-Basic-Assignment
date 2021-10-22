//Q12. Create a custom exception that do not have any stack trace

package Ques12;

import static Ques12.ExceptionExample.validate;

public class Main {
    public static void main(String[] args) {
        try {
            validate("male");
        } catch (CustomException e) {
            System.out.println("Custom Exception found: " + e);
        }
    }
}
