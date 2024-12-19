class Solution {
    public int[] solution(int n) {
        
        int totalNumbers = n * (n + 1) / 2;
        int[] answer = new int[totalNumbers];

        int[] dx = {1, 0, -1};
        int[] dy = {0, 1, -1};
        
        int x = 0 ;
        int y = 0;
        int direction = 0;

        for (int num = 1; num <= totalNumbers; num++) {
            int index = x * (x + 1) / 2 + y; 
            answer[index] = num;
            
            int nx = x + dx[direction];
            int ny = y + dy[direction];

            if (nx >= n || ny > nx || ny < 0 || answer[nx * (nx + 1) / 2 + ny] != 0) {
                direction = (direction + 1) % 3;
                nx = x + dx[direction];
                ny = y + dy[direction];
            }
            x = nx;
            y = ny;
        }
        return answer;
    }
}
