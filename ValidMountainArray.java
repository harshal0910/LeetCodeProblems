/*
Given an array of integers arr, return true if and only if it is a valid mountain array.

Recall that arr is a mountain array if and only if:

arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i] 
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
*/
class Solution {
    public boolean validMountainArray(int[] arr) {
        int l=0,r=arr.length-1;
        if(arr.length<3){
            return false;
        }
        while(l+1<arr.length-1 && arr[l]<arr[l+1]){
            l++;
        }
        while(r-1>0&&arr[r]<arr[r-1]){
            r--;
        }
        return l==r;
    }
}
