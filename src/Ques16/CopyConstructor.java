package Ques16;

public class CopyConstructor {
    private static int ID;
    private static String StudentName;
    //constructor to initialize roll number and name of the student
    CopyConstructor(int ID, String StudentName)
    {
        this.ID = ID;
        this.StudentName = StudentName;
    }
    //creating a copy constructor
    CopyConstructor(CopyConstructor cons)
    {
        System.out.println("\nAfter invoking the Copy Constructor:\n");
        ID =  cons.ID;
        StudentName = cons.StudentName;
    }
    //creating a method that returns the ID of the Student
    Integer showID()
    {
        return ID;
    }
    //creating a method that returns the name of the Student
    String showName()
    {
        return StudentName;
    }

    public static void main(String args[])
    {
        CopyConstructor copyConstructor = new CopyConstructor(987, "Bhavya Garg");
        System.out.println("Name of the Student1: "+ copyConstructor.showName());
        System.out.println("Id of the Student1: "+ copyConstructor.showID());
//passing the parameters to the copy constructor
        CopyConstructor copyConstructor2 = new CopyConstructor(copyConstructor);
        System.out.println("Name of the Student2: "+ copyConstructor2.showName());
        System.out.println("Id of the Student2: "+ copyConstructor2.showID());
    }
}
