/*
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 

Example 1:

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4
Example 3:

Input: nums = [1]
Output: 1
*/
class Solution {
    public int singleNumber(int[] nums) {
        int count;
        for(int i=0;i<nums.length;i++){
            count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;                  
                    }
                
            }
            if(count==1){
                    return nums[i];
                }
        }
        return 0;
    }
}
/*
class Solution {
    public int singleNumber(int[] nums) {
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
            ans=ans^nums[i];
        }

        return ans;
    }
}
*/
