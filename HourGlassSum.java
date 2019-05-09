import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HourGlassSum {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int max_sum = 0;
        for(int row = 0; row <= arr.length - 3; row++) {                       
            for (int col = 0; col <= arr.length - 3; col++) {                
                int sum = 0;
                sum = arr[row][col] + arr[row][col+1] + arr[row][col+2];
                sum += arr[row+1][col+1];
                sum += arr[row+2][col] + arr[row+2][col+1] + arr[row+2][col+2];
                if (sum > max_sum)
                    max_sum = sum;
            }            
        }
        return max_sum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
