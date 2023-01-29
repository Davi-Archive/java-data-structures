package array;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class DuplicateInArray {

    public static Set<Integer> duplicated() {
        int arr[] = {3, 6, 8, 8, 10, 12, 15, 15, 15, 20};
        Set<Integer> res = new HashSet<>();
        Map<Integer, Integer> count = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    res.add(arr[i]);
                    count.put(i, arr[i]);
                }
            }
        }
        System.out.println(count.values());
        System.out.println(count.entrySet());
        return res;
    }

    public static int[] duplicatedWithHash() {
        int[] arr = {3, 6, 8, 8, 10, 12, 15, 15, 15, 20};
        Set<Integer> res = new HashSet<>();
        int[] listed = new int[21];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            listed[arr[i]]++;
        }

        for (int j = 0; j < listed.length; j++) {
            if (listed[j] > 1) {
                map.put(j, listed[j]);
            }
        }
        System.out.println(map.entrySet());
        return listed;
    }


    public static void main(String[] args) {
        duplicated().forEach(x -> System.out.printf("%d ", x));

        Arrays.stream(duplicatedWithHash()).forEach(x -> System.out.printf(" %d", x));

    }
}
