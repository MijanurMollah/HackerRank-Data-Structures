
    // Complete the reverseArray function below.
    static int[] reverseArray(int[] a) {
        int inputArrSize = a.length;
        int[] arr = new int[inputArrSize];
        for(int i = 0; i < inputArrSize; i++) {
            arr[i] = a[inputArrSize - i - 1];
        }
        return arr;
    }
