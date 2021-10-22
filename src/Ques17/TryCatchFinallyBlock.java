//Q17. WAP showing try, multi-catch and finally blocks.

package Ques17;

public class TryCatchFinallyBlock {
    public static void main(String[] args) {
        try {
            int[] arr = new int[10];
            arr[11] = 25 / 25;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (ArithmeticException ae) {
            System.out.println(ae);
        } finally {
            System.out.println("Finally Block executed.");
        }
    }
}
