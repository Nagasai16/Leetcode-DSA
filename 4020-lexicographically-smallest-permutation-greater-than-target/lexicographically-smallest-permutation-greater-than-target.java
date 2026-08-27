class Solution {
    public String lexGreaterPermutation(String s, String target) {
      
        int n = s.length();
        int[] totalCount = new int[26];
        for (int i = 0; i < n; i++) {
            totalCount[s.charAt(i) - 'a']++;
        }
        int[] currCount = totalCount.clone();
        int maxMatch = 0;
        for (int i = 0; i < n; i++) {
            int charIdx = target.charAt(i) - 'a';
            if (currCount[charIdx] > 0) {
                currCount[charIdx]--;
                maxMatch++;
            } else {
                break;
            }
        }
        int startIdx = Math.min(maxMatch, n - 1);
        int[][] prefixFreq = new int[n + 1][26];
        prefixFreq[0] = totalCount.clone();
        for (int i = 0; i < maxMatch; i++) {
            prefixFreq[i + 1] = prefixFreq[i].clone();
            prefixFreq[i + 1][target.charAt(i) - 'a']--;
        }
        for (int i = startIdx; i >= 0; i--) {
            int targetChar = target.charAt(i) - 'a';
            int[] available = prefixFreq[i];
            for (int c = targetChar + 1; c < 26; c++) {
                if (available[c] > 0) {
                    StringBuilder sb = new StringBuilder();

                    sb.append(target, 0, i);

                    sb.append((char) ('a' + c));
                    available[c]--;

                  
                    for (int ch = 0; ch < 26; ch++) {
                        while (available[ch] > 0) {
                            sb.append((char) ('a' + ch));
                            available[ch]--;
                        }
                    }

                    return sb.toString();
                }
            }
        }

        return "";
    }
}
    
