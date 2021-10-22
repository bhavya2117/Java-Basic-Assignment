//Create 3 subclasses of bank SBI, BOI, ICICI all 4 should have a method called get details which provide there specific details like rate of interest etc, print details of every bank.

package Ques9;

public class MainClass {
    public static void main(String[] args) {
        Bank obj1 = new BOI();
        Bank obj2 = new SBI();
        Bank obj3 = new ICICI();
        System.out.println("\nDetails of BOI: ");
        obj1.getDetails();
        System.out.println("\nDetails of SBI: ");
        obj2.getDetails();
        System.out.println("\nDetails of ICICI: ");
        obj3.getDetails();

    }
}