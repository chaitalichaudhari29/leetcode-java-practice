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
