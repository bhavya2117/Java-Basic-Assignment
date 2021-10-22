package Ques12;

public class ExceptionExample {

    static void validate(String str) throws CustomException {
        if (!str.equalsIgnoreCase("female")) {
            throw new CustomException("ONly female candidate required");
        } else {
            System.out.println("You are eligible to apply");
        }

    }
}
