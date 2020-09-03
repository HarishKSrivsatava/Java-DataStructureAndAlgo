import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the reverseArray function below.
    static int[] reverseArray(int[] a) {
       for(int i = 0 ; i <= (a.length)/2; i++){
           for(int j = (a.length-1) ; j>= (a.length)/2; j--){
               int temp = a[i];
               a[i] = a[j];
               a[j] = temp;
           }
       }
       return a;
    }

    public static void main(String[] args) throws IOException {
     

        int[] arr = new int[5];
        int t = 0;
        for (int i = 0; i < arr.length; i++) {
        	arr[i]= t;
        	t++;
         }
        System.out.print("Original array:  ");
        for (int i = 0; i < arr.length; i++) {
           System.out.print(arr[i]);
        }
        int[] res = reverseArray(arr);
        System.out.print("Reversed array:  ");
        for (int i = 0; i < res.length; i++) {
           System.out.print(res[i]);
        }

    }
}
