package Ques20;

public class Duck implements Fly {
    int weight, noOfWings;
    Birds.DuckType duckType;

    public Duck(int weight, int noOfWings, Birds.DuckType duckType) {
        this.weight = weight;
        this.noOfWings = noOfWings;
        this.duckType = duckType;
    }

    @Override
    public void showDetail() {
        if (duckType == Birds.DuckType.Mallard) {
            System.out.println("Mallard duck:");
        }
        if (duckType == Birds.DuckType.Rubber) {
            System.out.println("Rubber duck:");
        }
        if (duckType == Birds.DuckType.Redhead) {
            System.out.println("Redhead duck:");
        }
        System.out.println("Weight:   " + weight);
        System.out.println("Number of wings:   " + noOfWings);
    }
}
