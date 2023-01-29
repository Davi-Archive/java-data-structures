package array;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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

    public static void main(String[] args) {
        duplicated().stream().forEach(x -> System.out.printf("%d ", x));

    }
}
