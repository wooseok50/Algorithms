import java.util.*;

class Solution {
    
    private int maxCount = 0;

    public int solution(int fatigue, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        explore(fatigue, dungeons, visited, 0);
        return maxCount;
    }

    private void explore(int fatigue, int[][] dungeons, boolean[] visited, int count) {
        maxCount = Math.max(maxCount, count);

        for (int i = 0; i < dungeons.length; i++) {
            if (visited[i] || fatigue < dungeons[i][0]) continue;

            visited[i] = true;
            explore(fatigue - dungeons[i][1], dungeons, visited, count + 1);
            visited[i] = false;

            if (maxCount == dungeons.length) return;
        }
    }
}