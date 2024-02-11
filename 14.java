/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
*/

class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String str1 = strs[0];
        String str2 = strs[strs.length-1];
        int idx=0;
        while(idx<str1.length() && idx < str2.length()){
            if(str1.charAt(idx)==str2.charAt(idx)){
                idx++;
            }
            else{
                break;
            }
        }
        return str1.substring(0,idx);
    }
}
