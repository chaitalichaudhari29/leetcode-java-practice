/**
 * LeetCode 1672 - Richest Customer Wealth
 *
 * Difficulty: Easy
 *
 * Problem:
 * Given a 2D array where accounts[i][j] represents the amount of money
 * the i-th customer has in the j-th bank.
 *
 * Approach:
 * - Traverse each customer's accounts
 * - Compute total wealth per customer
 * - Track maximum wealth
 *
 * Time Complexity: O(m * n)
 * Space Complexity: O(1)
 *
 * Pattern: Array Traversal
 */
class Solution {
    public int maximumWealth(int[][] accounts) {
     	int maxWealth = 0;
		for (int m = 0; m < accounts.length; m++) { // rows
			int customerWealth = 0;
			for (int n = 0; n < accounts[m].length; n++) { // cols
				customerWealth = customerWealth + accounts[m][n];
			}
			if (customerWealth > maxWealth) {
				maxWealth = customerWealth;
			}
		}
		return maxWealth;   
    }
}
