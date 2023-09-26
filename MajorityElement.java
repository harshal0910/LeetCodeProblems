/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
*/
// class Solution {
//     public int majorityElement(int[] nums) {
//         //int count=0;
//         int temp=0;
//         Map<Integer,Integer> map = new HashMap<>();
//         for(int i=0;i<nums.length;i++){
//             if(map.containsKey(nums[i])){
//                 int count=map.get(nums[i]);
//                 count+=1;
//                 map.put(nums[i],count);
//                 break;
//             }
//             map.put(nums[i],1);
//         }
//         Map.Entry<Integer,Integer> maxEntry=null;
//         for(Map.Entry<Integer,Integer>entry:map.entrySet()){
//             if(maxEntry==null||entry.getValue()>maxEntry.getValue()){
//                 maxEntry=entry;
//             }
//         }
//         int foundKey=0;
//         for (Map.Entry<Integer, Integer> res : map.entrySet()) {
//             if (res.getValue().equals(maxEntry.getValue())) {
//                 foundKey = res.getKey();
//                 break; // Exit the loop once the key is found
//             }
//         }
//         return foundKey;
//     }
// }
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
