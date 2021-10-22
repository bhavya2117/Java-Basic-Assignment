package Ques9;

public class ICICI implements Bank{
    String Name="ICICI Bank";
    String Location="Delhi";
    int rateOfInterest=12;

    @Override
    public void getDetails() {
        System.out.println("Bank Name: "+this.Name);
        System.out.println("Bank Location: "+this.Location);
        System.out.println("Rate of Interest: "+this.rateOfInterest);

    }
}
