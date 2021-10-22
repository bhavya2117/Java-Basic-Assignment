package Ques16;

public class Employee extends Cloneable {
    String name;
    int age;

    Employee(int age, String name){
        this.age=age;
        this.name=name;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

