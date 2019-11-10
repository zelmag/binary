public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int counter = 0;
        while(n != 0){ //n could be negative.
            if((n & 0x01) == 1){
                counter++;
            }
            n = n >>> 1; //unsigned right shift in java. fills trailing spots with zeros. >> fills them with 1's
        }
       return counter; 
    }
}
