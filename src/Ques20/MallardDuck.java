package Ques20;

public class MallardDuck extends Duck {
    public MallardDuck(int weight, int noOfWings, Birds.DuckType duckType) {
        super(weight, noOfWings, duckType);
    }

    @Override
    public void showDetail() {
        super.showDetail();
        System.out.println("Mallard ducks fly fast and quack loud.\n");
    }
}
