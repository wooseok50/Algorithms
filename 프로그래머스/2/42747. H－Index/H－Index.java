import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {    
        Arrays.sort(citations);
        
        int n = citations.length; 
        int h = 0; 
        
        for (int i = 0; i < n; i++) {
            int r = n - i; 
            int count = citations[i]; 
            if (count >= r) {
                h = r;
                break; 
            }
        }   
        return h;
    }
}