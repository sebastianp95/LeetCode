class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        for (char character : s.toCharArray()) {
            if (map.containsKey(character)) {
                if (stack.isEmpty() || stack.pop() != map.get(character)) {
                    return false;
                }
            } else {
                stack.push(character);
            }
        }

        return stack.isEmpty();
    }
}