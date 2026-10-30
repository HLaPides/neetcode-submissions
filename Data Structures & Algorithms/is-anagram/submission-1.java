class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] characters = new int[26];
        for (int i=0;i<s.length();i++) {
            characters[s.charAt(i) - 'a'] += 1;
            characters[t.charAt(i) - 'a'] -= 1;
        }
        for (int j=0;j<characters.length;j++) {
            if (characters[j] != 0) {
                return false;
            }
        }
        return true;
    }
}
