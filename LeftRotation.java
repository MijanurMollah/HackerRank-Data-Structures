import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class LeftRotation {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        //Given an array of n integers and a number, d, perform d left rotations on the array
        //I have only written the lines from here
        for (int i = 0; i < d; i++) {
            int first_val = a[0];
            for (int j = 1; j < n; j++) {
                a[j-1] = a[j]; 
            }
            a[n-1] = first_val;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        //To here

        scanner.close();
    }
}
