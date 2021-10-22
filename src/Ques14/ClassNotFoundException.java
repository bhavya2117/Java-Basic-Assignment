//Q14.WAP to produce NoClassDefFoundError and ClassNotFoundException exception.

package Ques14;

public class ClassNotFoundException {
    public static void main(String args[]) {

        try {
            demo obj = new demo();
        } catch (Throwable e) {
            System.out.print(e);
        }
        demo obj2 = new demo();
    }

}

