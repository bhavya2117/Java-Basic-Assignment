//Write a Java program to return true if a given string contain the string 'pop', but the middle 'o' also may other character.

package Ques1;

public class PopInTheString {
    public static void main(String[] args) {
        PopInTheString obj = new PopInTheString();
        String str = "asjnjanpop";
        System.out.println(obj.checkIfContainPop(str));

    }

    public boolean checkIfContainPop(String str) {
        int len = str.length();
        for (int i = 0; i < len - 2; i++) {
            if (str.charAt(i) == 'p' && str.charAt(i + 2) == 'p')
                return true;
        }
        return false;
    }
}
