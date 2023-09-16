/*
Given a string array words, return an array of all characters that show up in all strings within the words (including duplicates). You may return the answer in any order.

 

Example 1:

Input: words = ["bella","label","roller"]
Output: ["e","l","l"]
Example 2:

Input: words = ["cool","lock","cook"]
Output: ["c","o"]
*/
class Solution {
    public List<String> commonChars(String[] words) {
        List<String> res=new ArrayList<>();
        int[] commonChars=new int[26];
        Arrays.fill(commonChars,Integer.MAX_VALUE);

        for(String s:words){
            int[] cnt=new int[26];
            for(char c:s.toCharArray()){
                cnt[c-'a']++;
            }

            for(int j=0;j<26;j++){
                commonChars[j]=Math.min(commonChars[j],cnt[j]);
            }
        }

        for(int i=0;i<26;i++){
            for(int j=0;j<commonChars[i];j++){
                
                res.add(""+(char)(i+'a'));
            }
        }
        return res;
    }
}
