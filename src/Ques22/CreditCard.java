//Q22.Check Digits. Credit cards usually have a so-called check digit. This is a single digit that I assigned when the account number is developed and has a special property. One particularly simple mechanism is to assign the last digit of the sum of all the other digits. For example, suppose we have a nine-digit account number (including the check digit). The check digit would be the sum of the eight digits. This digit could be placed any where’s in the sequence, say the
//third digit. As a full example, suppose the eight numbers are 12345678. Their sum is 36; thus, 6 is the check digit. The account number is therefore 126345678. Write a program to read in a nine digit integer from the keyboard and check it for these rules. Write"okay" or "not okay" for the results of the test.

package Ques22;

class CreditCard {
    static boolean isValid(String cardNo) {
        int Sum = 0;
        boolean flag = false;
        for (int i = cardNo.length() - 1; i >= 0; i--) {
            int d;
            d = cardNo.charAt(i) - '0';

            if (flag == true)
                d = d * 2;

            Sum += d / 10;
            Sum += d % 10;

        }
        return (Sum % 10 == 0);
    }

    static public void main(String[] args) {
        // String cardNo = "126345678"; //Not Okay
        String cardNo = "623456789"; //Okay
        if (isValid(cardNo))
            System.out.println("Okay");
        else
            System.out.println("Not Okay");
    }
}