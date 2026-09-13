package Array_And_Hashing;

// Problem: Group Anagram
// Given an array of strings, group anagrams together.
// Example:
// Input: ["eat", "tea", "tan", "ate", "nat", "bat"]
// Output:
// [  ["ate","eat","tea"],
//   ["nat","tan"],
//   ["bat"]
// ]
import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String S : strs) {
            int[] count = new int[26];
            for (char c : S.toCharArray()) {
                count[c - 'a']++;
            }
            String result = Arrays.toString(count);
            map.putIfAbsent(result, new ArrayList<>());
            map.get(result).add(S);
        }
        return new ArrayList<>(map.values());
    }
}

// here there were many problem arised due to java language which are added in
// th notes