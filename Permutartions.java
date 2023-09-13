/*
Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.

 

Example 1:

Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
Example 2:

Input: nums = [0,1]
Output: [[0,1],[1,0]]
Example 3:

Input: nums = [1]
Output: [[1]]
*/
class Solution {

    public void backtrack(List<List<Integer>> result,List<Integer> temp,int[] nums){
        if(temp.size()==nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }


        for(int number:nums){
            if(temp.contains(number)){
                continue;
            }

            temp.add(number);

            backtrack(result,temp,nums);

            temp.remove(temp.size()-1);

        }

    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        backtrack(result,new ArrayList<>(),nums);
        return result;
    }
}
