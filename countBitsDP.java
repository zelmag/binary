//Dynamic programming solution 
//if nums%2, then same as num/2's number of 1's. If power of 2, same as num/2 set bits
//if not, then same as num/2's numbers of ones + 1
class Solution {
    public int[] countBits(int num) {
        int[] res = new int[num+1];
        for(int i = 0; i<= num; i++){
            res[i] = res[i/2] + i % 2;
        }
        return res;
    }
}
