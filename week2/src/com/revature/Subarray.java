package com.revature;

public class Subarray {
    static void find(int []arr, int X) {
        for(int i=0; i< arr.length; i++) {
            int sum = 0;
            for (int j=i; j<arr.length; j++) {
                sum += arr[j];
                if (sum == X) {
                    for (int k=i; k<=j; k++) {
                        System.out.println(arr[k]);
                    }
                    return;
                }
            }
        }
    }
}
