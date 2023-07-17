// 28. FIND THE INDEX OF THE FIRST OCCURRENCE IN A STRING

class Solution {
    public int strStr(String haystack, String needle) {
        int ans;

        if(haystack.contains(needle)) {
            ans = haystack.indexOf(needle);
            return ans;
        }
        return -1;
    }
}
