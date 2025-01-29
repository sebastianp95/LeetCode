class PalindromeBrute {

    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }

        return s.equals(reversed);
    }

    public static void main(String[] args) {
        PalindromeBrute palindrome = new PalindromeBrute();
        System.out.println(palindrome.isPalindrome("A man a plan a canal Panama"));
    }
}
