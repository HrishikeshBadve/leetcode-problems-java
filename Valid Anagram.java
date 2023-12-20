/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example:-
Input: s = "anagram", t = "nagaram"
Output: true
*/

class Solution {
    public boolean isAnagram(String s, String t) {
        char[] Char_s = s.toCharArray();
        char[] Char_t = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        return Arrays.equals(sChars, tChars);
    }
}
