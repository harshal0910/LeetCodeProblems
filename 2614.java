/*
ou are given a 0-indexed two-dimensional integer array nums.

Return the largest prime number that lies on at least one of the diagonals of nums. In case, no prime is present on any of the diagonals, return 0.

Note that:

An integer is prime if it is greater than 1 and has no positive integer divisors other than 1 and itself.
An integer val is on one of the diagonals of nums if there exists an integer i for which nums[i][i] = val or an i for which nums[i][nums.length - i - 1] = val.
*/
class Solution {
    public int diagonalPrime(int[][] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i][i] && prime(nums[i][i])) {
                max = nums[i][i];
            }
            if (max < nums[i][nums.length - i - 1] && prime(nums[i][nums.length - 1 - i])) {
                max = nums[i][nums.length - 1 - i];
            }
        }
        return max;
    }

    public static boolean prime(int n) {
        if (n == 1)
            return false;
        int count = 0;
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
