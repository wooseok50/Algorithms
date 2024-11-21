class Solution {     
    public String solution(String X, String Y) {         
       
        int[] a = new int[10];
        int[] b = new int[10];
        
        for (char ch : X.toCharArray()) {
            a[ch - '0']++;
        }
        for (char ch : Y.toCharArray()) {
            b[ch - '0']++;
        }
        
        StringBuilder answer = new StringBuilder();
        for (int i = 9; i >= 0; i--) {
            int count = Math.min(a[i], b[i]);
            for (int j = 0; j < count; j++) {
                answer.append(i);
            }
        }
        
        if (answer.length() == 0) {
            return "-1"; 
        }
        if (answer.chars().allMatch(c -> c == '0')) {
            return "0"; 
        }
        
        return answer.toString();
    }
}
