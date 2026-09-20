class Solution {
    public int reverseDegree(String s) {
        int totalDegree = 0;
        int n = s.length();
        for(int i=0;i<n;i++){
            int reversedAlphabetPos = 'z' - s.charAt(i) + 1;
            int stringPos = i+1;
            totalDegree += reversedAlphabetPos * stringPos;
        }
        return totalDegree;
    }
}