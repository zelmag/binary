// for sum 0 to n thats n(n-1)/2
//for sum 1 to n, thats n*(n+1)/2
//find the missing number by taking the sum and then difference from what it should be 
class Solution {
    public int missingNumber(int[] nums) {
        //law sum of 0 to n is (n/2)*(n-1)
        int sum = 0;
        for(int i = 0; i<nums.length; i++){
            sum+= nums[i];
        }
        // n = nums.length + 1 bc its number of elements present
        int n = nums.length + 1;
        int difference = (n*(n-1))/2 - sum;
        return difference; //this is what is missing 
    }
}
