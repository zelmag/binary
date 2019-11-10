//Add without + or -
//Bitshift. Carry = a & b << 1. Then add a ^ b. b = carry. Add until there are no more carries
class Solution {
    public int getSum(int a, int b) {
    //b will be my carry. Keep adding carry until it is zero. 
     while (b != 0) {
        int carry = (a & b) << 1; //where carry's will be. Order is here bc a will change so cant put this statement after a = a ^ b
        a = a ^ b; //my addition
        b = carry; 
        //b will store where my carry are << 1 bc thats how carrys work 1 & 1 = 1 (carry is 1 << 1) 
    }
    return a;
    }
}
