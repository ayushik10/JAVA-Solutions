// 1051.  HEIGHT CHECKER

class Solution {
    public int heightChecker(int[] heights) {
        int[] sorted = Arrays.copyOf(heights, heights.length);

        Arrays.sort(sorted);
        int count=0;

        for(int i=0; i<heights.length; i++) {
            if(sorted[i] != heights[i])
            count++;
        }
        return count;
    }
}
