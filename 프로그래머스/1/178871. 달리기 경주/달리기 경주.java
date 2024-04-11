import java.util.Map;
import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }
       
        for (String p : callings) {
            int i = map.get(p); 
            String fp = players[i - 1]; 

            players[i - 1] = p;
            players[i] = fp;

            map.put(p, i - 1);
            map.put(fp, i);
        }

        return players;
    }
}