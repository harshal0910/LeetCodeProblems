/*
Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.

Return any array that satisfies this condition.

 

Example 1:

Input: nums = [3,1,2,4]
Output: [2,4,3,1]
Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
Example 2:

Input: nums = [0]
Output: [0]
*/
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for(int i:nums){
            list.add(i);
        }
        int j=nums.length-1;
        int k=0;
        for(Integer i:list){
            if(i%2!=0){
                nums[j--]=i;
            }else{
                nums[k++]=i;
            }
        }
        return nums;
    
    }
}
