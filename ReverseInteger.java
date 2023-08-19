/*
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21
 

Constraints:

-231 <= x <= 231 - 1
*/

class Solution {
    public int reverse(int x) {
        int r=0;
        long rev=0;
        while(x!=0){
            r=x%10;
            rev+=r;
            rev=rev*10;
            x=x/10;
        }
        rev=rev/10;
        if(rev > Integer.MAX_VALUE || rev<Integer.MIN_VALUE){
            return 0;
        }
        if(x<0){
            return (int)(-1*rev);
        }
        return (int)rev;
       
    }
}
