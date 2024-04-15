import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        List<Integer> answer = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        
        // (100 - 진행률[i] + 속도[i] - 1) / 속도[i]
        for(int i = 0; i < progresses.length; i++){
            queue.add((100 - progresses[i] + speeds[i] - 1) / speeds[i]);
        }  
       
        while (!queue.isEmpty()){
            int count = 1;           
            int day = queue.remove();
            
            while(!queue.isEmpty() && day >= queue.peek()){
                count++;
                queue.remove();
            }
            answer.add(count);
        }
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}