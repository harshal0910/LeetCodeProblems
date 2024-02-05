/*
Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

 

Example 1:

Input: s = "leetcode"
Output: 0
Example 2:

Input: s = "loveleetcode"
Output: 2
Example 3:

Input: s = "aabb"
Output: -1
*/

class Solution {
    public int firstUniqChar(String s) {
        int fIndex=-1,lIndex=-1;
        for(char c:s.toCharArray()){
            fIndex = s.indexOf(c);
            lIndex = s.lastIndexOf(c);
            if(fIndex==lIndex){
                return fIndex;
            }
        } 
        return -1;
    }
}
