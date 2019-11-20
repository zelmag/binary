public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        //now add it back 
        int res = 0;
        for(int i = 1; i <= 32; i++){
            int lsb = n & 0x01;
            res = res | ((lsb) << (32-i)); //to get from bit 0 to bit 32, it needs to do 31 jumps
            n = n>>>1;
        }
        return res;
    }
}
