// 258.  ADD DIGITS

class Solution {
    public int addDigits(int num) {
        int ans = 0;

        while(num != 0){
            int digit = num%10;
            ans += digit;
            num = num/10;
        }
        
        if(ans < 10)
        return ans;
        else
        return addDigits(ans);
    
    }
}
