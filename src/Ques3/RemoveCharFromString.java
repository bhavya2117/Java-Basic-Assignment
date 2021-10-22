//Write a Java program to remove a specified character from a given string.

package Ques3;

public class RemoveCharFromString {
    public static void main(String[] args) {
        String str1 = "abxhbaahshhsaaa";
        char ch='a';
        String str2 = str1.replace("a","");
        System.out.println("\nOriginal string:");
        System.out.println(str1);
        System.out.println("\nUpdated string:");
        System.out.println(str2);

    }
}
