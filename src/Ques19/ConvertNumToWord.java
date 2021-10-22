//Convert a non-negative integer num to its English words representation.

package Ques19;

import java.util.Scanner;

public class ConvertNumToWord{
    private static String[] lessThanTwenty = new String[]{"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static String[] tens = new String[]{"", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public String numberToWords(int num) {
        if (num == 0) {
            return "Zero";
        }
        return helper(num);
    }

    private String helper(int num) {
        StringBuilder res = new StringBuilder();
        if (num >= 1000000000) {
            res.append(helper(num / 1000000000)).append(" Billion ").append(helper(num % 1000000000));
        } else if (num >= 1000000) {
            res.append(helper(num / 1000000)).append(" Million ").append(helper(num % 1000000));
        } else if (num >= 1000) {
            res.append(helper(num / 1000)).append(" Thousand ").append(helper(num % 1000));
        } else if (num >= 100) {
            res.append(helper(num / 100)).append(" Hundred ").append(helper(num % 100));
        } else if (num >= 20) {
            res.append(tens[num / 10 - 1]).append(" ").append(helper(num % 10));
        } else {
            res.append(lessThanTwenty[num]);
        }

        return res.toString().trim();
    }
    public static void main(String...args){
        ConvertNumToWord obj=new ConvertNumToWord();
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(obj.numberToWords(i));
    }
}