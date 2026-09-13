// Problem Name: Valid Anagram
// Problem Description:
// Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, and `false` otherwise. An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters           exactly once.
// code:
// class Solution {
// public:
//     bool isAnagram(string s, string t) {
//         if(s.size() != t.size()) return false;
//         unordered_map<char,int> mp;
//         for(int i=0; i< s.length(); i++){
//             mp[s[i]]++;
//         }
//         for(int i=0; i<t.length(); i++){
//             mp[t[i]]--;
//         }
//         for(auto& pair: mp) if(pair.second > 0) return false;
//         return true;
//     }
// };