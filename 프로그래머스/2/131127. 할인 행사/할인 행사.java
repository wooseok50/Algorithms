import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < want.length; i++) {
            map.put(want[i], number[i]);
        }

        for (int i = 0; i <= discount.length - 10; i++) {
            Map<String, Integer> temp = new HashMap<>(map);
            boolean b = true;

            for (int j = i; j < 10 + i; j++) {
                String s = discount[j];
                
                if (temp.containsKey(s) && temp.get(s) > 0) {
                    temp.put(s, temp.get(s) - 1);
                } else {
                    b = false;
                    break;
                }
            }
            if (b) {
                answer++;
            }
        }
        return answer;
    }
}