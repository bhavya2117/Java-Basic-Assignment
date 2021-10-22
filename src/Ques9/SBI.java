package Ques9;

public class SBI implements Bank{
    String Name="State bank of India";
    String Location="Greater Noida";
    int rateOfInterest=6;

    @Override
    public void getDetails() {
        System.out.println("Bank Name: "+this.Name);
        System.out.println("Bank Location: "+this.Location);
        System.out.println("Rate of Interest: "+this.rateOfInterest);

    }
}
