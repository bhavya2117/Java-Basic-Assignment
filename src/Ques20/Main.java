//Q20.This assignment is supposed to make you practice your skills on interfaces, classes and OOPs.
//Story - The system is a duck simulation game. There are ducks, each having weight and number of wings. All ducks can fly and quack, but different type of ducks fly and quack differently. For instance, let us consider the following–
//1.Rubber ducks don’t fly and squeak.
//2.Mallard ducks fly fast and quack loud.
//3.Redhead ducks fly slow and quack mild.
//All ducks have following common property:
//Type of Duck – Use enum to represent this value
//Design classes and interfaces for the above story to meet the following requirements -
//a.Create a duck
//b.Show details of a duck, i.e. when you call for e.g. ShowDetails() method of a duck, duck should print its traits.
//User following concepts: class, interfaces, polymorphism etc.

package Ques20;

public class Main {
    public static void main(String[] args) {
//Create ducks
        Fly[] ducks = new Fly[3];
        ducks[0] = new RubberDuck(12, 2, Birds.DuckType.Rubber);
        ducks[1] = new MallardDuck(9, 2, Birds.DuckType.Mallard);
        ducks[2] = new RedheadDuck(15, 4, Birds.DuckType.Redhead);

        //Show details of a duck, i.e. when you call for e.g. ShowDetails() method of a duck, duck should print its traits.
        for (int i = 0; i < 3; i++) {
            ducks[i].showDetail();
        }
    }
}
