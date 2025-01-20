class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
            List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        
        for (int i = 0; i < strs.length; i++) {
           
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);
           
            
            if (!map.containsKey(sortedWord)) {
                System.out.println("Adding new key to map: " + sortedWord);
                map.put(sortedWord, new ArrayList<>());
            }
            
            System.out.println("Adding original string to map under key " + sortedWord);
            map.get(sortedWord).add(strs[i]);
        }
        
        result.addAll(map.values());
        return result;
        
    }
}