package Ques20;

public class RedheadDuck extends Duck{
    public RedheadDuck(int weight, int noOfWings, Birds.DuckType duckType) {
        super(weight, noOfWings, duckType);
    }

    @Override
    public void showDetail() {
        super.showDetail();
        System.out.println("Redhead ducks fly slow and quack mild.");
    }
}
