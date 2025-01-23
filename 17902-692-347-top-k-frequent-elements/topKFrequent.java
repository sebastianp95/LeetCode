import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class KFrequentElementsSolution {
    public int[] topKFrequent(int[] nums, int k) {
        // Step 1: Build the frequency map
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        System.out.println("Frequency Map: " + map);

        // Step 2: Build the bucket array
        List<Integer>[] buckets = new List[nums.length + 1];
        for (int key : map.keySet()) {
            int freq = map.get(key);
            if (buckets[freq] == null) {
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(key);
        }

        // Debugging: Print the bucket array
        // System.out.println("Buckets:");
        // for (int i = 0; i < buckets.length; i++) {
        //     if (buckets[i] != null) {
        //         System.out.println("Frequency " + i + ": " + buckets[i]);
        //     }
        // }

        // Step 3: Extract top k frequent elements
        List<Integer> result = new ArrayList<>();
        for (int i = buckets.length - 1; i >= 0 && result.size() < k; i--) {
            if (buckets[i] != null) {
                for (int num : buckets[i]) {
                    if (result.size() < k) {
                        result.add(num);
                        System.out.println("Added " + num + " to result. Current result: " + result);
                    }
                }
            }
        }

        System.out.println("Top " + k + " Frequent Elements: " + result);
        return result.stream().mapToInt(i -> i).toArray();
    }
}

public class KFrequentElements {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 4, 4, 4, 4, 4, 5, 5, 5};
        int k = 2;
        KFrequentElementsSolution solution = new KFrequentElementsSolution();
        solution.topKFrequent(nums, k);

    }
}
