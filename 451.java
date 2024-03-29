/*
Given a string s, sort it in decreasing order based on the frequency of the characters. The frequency of a character is the number of times it appears in the string.

Return the sorted string. If there are multiple answers, return any of them.

 

Example 1:

Input: s = "tree"
Output: "eert"
Explanation: 'e' appears twice while 'r' and 't' both appear once.
So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
Example 2:

Input: s = "cccaaa"
Output: "aaaccc"
Explanation: Both 'c' and 'a' appear three times, so both "cccaaa" and "aaaccc" are valid answers.
Note that "cacaca" is incorrect, as the same characters must be together.
Example 3:

Input: s = "Aabb"
Output: "bbAa"
Explanation: "bbaA" is also a valid answer, but "Aabb" is incorrect.
Note that 'A' and 'a' are treated as two different characters.
*/

class Solution {
    public String frequencySort(String s) {
        var map = new int[128][2];

        for (var i=0; i<128; i++)
              map[i][0] = i;

        for (var c : s.toCharArray())
              map[c][1]++;

        Arrays.sort(map, (a, b) -> Integer.compare(b[1], a[1]));

        var sb = new StringBuilder();

        for (var i=0; i<128; i++)
          while (map[i][1]-- > 0)
            sb.append((char) map[i][0]);

        return sb.toString();
    }
}
