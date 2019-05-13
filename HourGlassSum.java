

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

    
