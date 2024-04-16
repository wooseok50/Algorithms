import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;
        HashMap<String, Integer> map = new HashMap<>();
        
        for (String[] c : clothes) {
            String type = c[1];
            map.put(type, map.getOrDefault(type, 0) + 1);
        }
        
        answer = map.values().stream()
                             .mapToInt(count -> count + 1)
                             .reduce(1, (a, b) -> a * b) - 1;
        
        return answer;
    }
}