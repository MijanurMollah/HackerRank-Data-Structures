
        //Given an array of n integers and a number, d, perform d left rotations on the array
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
     
