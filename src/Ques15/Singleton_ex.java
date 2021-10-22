package Ques15;

public class Singleton_ex {
    private static Singleton_ex only_obj = null;
    public int x;

    private Singleton_ex() {
        x = 10;
    }

    public static Singleton_ex getObject() {
        if (only_obj == null) {
            only_obj = new Singleton_ex();
        }
        return only_obj;
    }
}