import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        
        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < priorities.length; i++) {
            queue.add(new int[]{priorities[i], i});
        }

        int executionOrder = 0;
        while (!queue.isEmpty()) {
            
            int[] current = queue.poll();
            int maxPriority = queue.stream()
                .mapToInt(process -> process[0]).max().orElse(0);

            if (current[0] < maxPriority) {
                queue.add(current);
            } else {
                executionOrder++;
                if (current[1] == location) {
                    return executionOrder;
                }
            }
        }
        return -1; 
    }
}
