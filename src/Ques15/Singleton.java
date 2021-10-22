//Q15. WAP to create a singleton class.

package Ques15;

public class Singleton {
    public static void main(String args[]) {
        Singleton_ex x = Singleton_ex.getObject();
        Singleton_ex y = Singleton_ex.getObject();
        Singleton_ex z = Singleton_ex.getObject();
        System.out.println("hashcode of \nx: " + x.hashCode() + "\ny: " + y.hashCode() + "\nz: " + z.hashCode());
    }
}
