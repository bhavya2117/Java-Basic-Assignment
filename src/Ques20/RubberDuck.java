package Ques20;

public class RubberDuck extends Duck {
    public RubberDuck(int weight, int noOfWings, Birds.DuckType duckType) {
        super(weight, noOfWings, duckType);
    }

    @Override
    public void showDetail() {
        super.showDetail();
        System.out.println("Rubber ducks don’t fly and squeak.\n");

    }
}
