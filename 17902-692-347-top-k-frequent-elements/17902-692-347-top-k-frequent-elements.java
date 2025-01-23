class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 0);
            }
            map.put(nums[i], map.get(nums[i]) + 1);
        }
  
        PriorityQueue<Integer> pq = new PriorityQueue<>((n1, n2) -> map.get(n1) - map.get(n2));
        for (int key : map.keySet()) {
            pq.add(key);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        System.out.println("pq: " + pq);
        return pq.stream().mapToInt(i -> i).toArray();
    }
}
