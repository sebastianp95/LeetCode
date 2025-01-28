class Solution {
    public boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            // System.out.println("left: " + left + " right: " + right);
            while (left < right && !isAlphanumeric(s.charAt(left))) {
                left++;
            }
            while (left < right && !isAlphanumeric(s.charAt(right))) {
                right--;
            }
            if (Character.toLowerCase(s.charAt(right)) != Character.toLowerCase(s.charAt(left))) {
                return false;
            }
            left++;
            right--;
        }

        return true;   

        
    }
      public boolean isAlphanumeric(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
    }
}