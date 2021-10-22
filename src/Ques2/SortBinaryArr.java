//Q2.Write a Java program to sort a given binary array in linear times.

package Ques2;

import java.util.Arrays;

public class SortBinaryArr {
    public static void SortBinaryArray(int[] arr) {
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[k++] = 0;
            }
        }
        for (int i = k; i < arr.length; i++) {
            arr[i] = 1;
        }
    }

    public static void main(String[] args) {
        int arr[] = {0, 1, 1, 0, 1, 1, 0, 1, 0, 0};
        System.out.println("Binary array is: " + Arrays.toString(arr));
        SortBinaryArray(arr);
        System.out.println("Sorted Binary Array is :  " + Arrays.toString(arr));
    }
}


