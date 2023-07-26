//REMOVE TRAILING ZEROES FROM A STRING

class Solution {
    public String removeTrailingZeros(String num) {
        
        int n = num.length()-1;

        for(int i=n; i>0; i--) {
            if(num.charAt(i) != '0') {
                break;
            }
            n--;
        }
        return num.substring(0, n+1);
    }
}
