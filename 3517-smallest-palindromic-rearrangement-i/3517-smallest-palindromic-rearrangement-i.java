class Solution {
    public String smallestPalindrome(String s) {
        int[] freq = new int[26];

        // Count frequency of each character
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        StringBuilder left = new StringBuilder();
        char mid = 0;

        // Build left half and find middle character
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < freq[i] / 2; j++) {
                left.append((char) ('a' + i));
            }
            if (freq[i] % 2 == 1) {
                mid = (char) ('a' + i);
            }
        }

        StringBuilder result = new StringBuilder();
        result.append(left);

        if (mid != 0) {
            result.append(mid);
        }

        result.append(new StringBuilder(left).reverse());

        return result.toString();
    }
}