/*
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

 

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.
*/

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        // List<Integer> list1=new ArrayList<>();
        // List<Integer> list2=new ArrayList<>();

        // if(nums1.length>nums2.length){
        //     for(int i:nums1){
        //     list1.add(i);
        // }

        // for(int i:nums2){
        //     if(list1.contains(i)){
        //         list2.add(i);
        //     }
        // }

        // int []res=new int[list2.size()];
        // int idx=0;
        // for(int i:list2){
        //     res[idx++]=i;
        // }
        // return res;
        // }
        // else{
        //     for(int i:nums2){
        //     list1.add(i);
        // }

        // for(int i:nums1){
        //     if(list1.contains(i)){
        //         list2.add(i);
        //     }
        // }

        // int []res=new int[list2.size()];
        // int idx=0;
        // for(int i:list2){
        //     res[idx++]=i;
        // }
        // return res;
        // }

        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    list.add(nums1[i]);
                    nums2[j]=-1;
                    break;
                }
            }
        }

        int[] arr=new int[list.size()];

        for(int i=0;i<arr.length;i++){
            arr[i]=list.get(i);
        }
        return arr;

    }
}
