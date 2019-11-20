class Solution {
    
    public int combinationSum4(int[] nums, int target) {
       int[] dp = new int[target+1]; //ways to get each target value utilizing every element.  
        dp[0] = 1; //there's only 1 way to get 0.
        for(int t = 1; t < dp.length; t++){
            for(int element = 0; element < nums.length; element++){
                if(t >= nums[element]){ //element fits in target
                    int targetLeft = t - nums[element];
                    dp[t]+=dp[targetLeft];
                }
            }
        }
        return dp[target];
    }
    
}
