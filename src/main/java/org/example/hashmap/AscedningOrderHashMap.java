package org.example.hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AscedningOrderHashMap {
    private static void sortArrayAscending(int[] nums) {
        Map<Integer, Integer> numfreq = new HashMap<>();
        for (int num : nums) {
            numfreq.put(num, numfreq.getOrDefault(num, 0) + 1);

        }
        System.out.println("I am  just trying to New Branch");
        int[] sortedArray = new int[nums.length];
        int index = 0;
        for (int key : numfreq.keySet()) {
            int count = numfreq.get(key);
            for (int i = 0; i < count; i++) {
                sortedArray[index] = key;
                index++;
            }
        }
        System.out.println("Sorted Array in Ascending Order: " + Arrays.toString(sortedArray));

    }

    public static void main(String[] args) {
        int[] nums = {3, 5, 2, 4, 3, 2, 5};
        sortArrayAscending(nums);
        System.out.println("Using java 8");
        Arrays.stream(nums).sorted().forEach(System.out::println);

    }
}

