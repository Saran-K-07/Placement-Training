// https://leetcode.com/problems/valid-anagram/
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] freq = new int[26];
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            char h = t.charAt(i);
            freq[c-'a']++;
            freq[h-'a']--;
        }
        for(int i=0;i<26;i++){
            if(freq[i]!=0)
            return false;
        }
        return true;
    }
}

// Driver Code
class p2{
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.isAnagram("anagram", "nagaram")); // true
        System.out.println(sol.isAnagram("rat", "car")); // false
    }
}