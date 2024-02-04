/*
Given a square matrix mat, return the sum of the matrix diagonals.

Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.
*/

class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        for(int i=0;i<mat[0].length;i++){
            if(i!=mat[0].length-1-i){
                sum += mat[i][i]; 
            }
            sum+= mat[i][mat[0].length-1-i];
        }
        return sum;
        
    }
}
