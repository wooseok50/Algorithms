import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        Arrays.sort(win_nums);
        int max = 0;
        int min = 0;
        
        for (int num : lottos) {
            if (num == 0)
                continue;
            if (Arrays.binarySearch(win_nums, num) >= 0) 
                min++;
        }

        int count = (int) Arrays.stream(lottos).filter(num -> num == 0).count(); 
        max = min + count; 
        
        answer[0] = max > 1 ? 7 - max : 6;
        answer[1] = min > 1 ? 7 - min : 6;

        return answer;
    }
   
}