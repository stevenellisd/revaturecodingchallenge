package com.revature;

import static java.lang.Integer.max;

public class LCS {
    static Integer LongestCommonSubsequence(String A, String B) {
        int m = A.length();
        int n = B.length();

        int c[][] = new int[m][n];

        for(int i=0; i<m; i++) {
            c[i][0] = 0;
        }
        for(int i=0; i<n; i++) {
            c[0][i] = 0;
        }

        for(int i=1; i<m; i++) {
            for(int j=1; j<n; j++) {
                if(A.charAt(i) == B.charAt(j)) {
                    c[i][j] = c[i-1][j-1] + 1;
                } else {
                    c[i][j] = max(c[i][j-1], c[i-1][j]);
                }
            }
        }

        return c[m-1][n-1];
    }
}
