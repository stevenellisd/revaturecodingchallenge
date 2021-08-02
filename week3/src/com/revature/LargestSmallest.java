package com.revature;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LargestSmallest {
    static void LargestSmallest(List<Integer> a) {
        Integer min = Collections.min(a);
        Integer max = Collections.max(a);

        System.out.println("Minimum: " + min.toString());
        System.out.println("Maximum: " + max.toString());
    }
}
