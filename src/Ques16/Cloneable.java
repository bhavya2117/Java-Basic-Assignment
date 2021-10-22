//Q16. WAP to show object cloning in java using cloneable and copy constructor both.

package Ques16;

public class Cloneable {
    public static void main(String[] args) {
        try {
            Employee obj = new Employee(21, "Bhavya");
            Employee obj2 = (Employee) obj.clone();
            System.out.println(obj.age + " " + obj.name);
            System.out.println(obj2.age + " " + obj2.name);

        } catch (CloneNotSupportedException e) {
        }
    }

}

