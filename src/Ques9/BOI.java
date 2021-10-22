package Ques9;

public class BOI implements Bank{
    String Name="Bank of India";
    String Location="Aligarh";
    int rateOfInterest=10;

    @Override
    public void getDetails() {
        System.out.println("Bank Name: "+this.Name);
        System.out.println("Bank Location: "+this.Location);
        System.out.println("Rate of Interest: "+this.rateOfInterest);

    }
}
