/**
 * LeetCode 1480 - Running Sum of 1D Array
 *
 * Difficulty: Easy
 *
 * Problem:
 * Given an array nums, return the running sum of nums.
 * The running sum at index i is the sum of all elements
 * from index 0 to i (inclusive).
 *
 * Example:
 * Input: nums = [1,2,3,4]
 * Output: [1,3,6,10]
 *
 * Approach:
 * - Iterate from index 1 onwards
 * - Add the previous element's sum to the current element
 * - Modify the array in-place to save space
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Pattern: Prefix Sum / Running Sum
 */
class Solution {
    public int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        runningSum[0] = nums[0];
        for(int i=1; i<nums.length; i++) {
            runningSum[i] = runningSum[i-1] + nums[i];
        }
        return runningSum;
    }
}
