class Solution {
    public int[] solution(String[] park, String[] routes) {
        
        int[] finalPosition = new int[2]; 
        int row = 0, col = 0; 
        
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                if (park[i].charAt(j) == 'S') {
                    row = i;  
                    col = j; 
                    break;
                }
            }
        }
        for (String route : routes) {
            String[] parts = route.split(" ");
            String direction = parts[0];
            int steps = Integer.parseInt(parts[1]);
            
            if (isValidMove(park, row, col, direction, steps)) {
                switch (direction) {
                    case "N": row -= steps; break;  
                    case "S": row += steps; break;  
                    case "E": col += steps; break; 
                    case "W": col -= steps; break;  
                }
            }
        }
        finalPosition[0] = row;
        finalPosition[1] = col;
        
        return finalPosition;
    }

    private boolean isValidMove(String[] park, int row, int col, String direction, int steps) {
        int parkHeight = park.length;
        int parkWidth = park[0].length();

        for (int i = 1; i <= steps; i++) {
            int newRow = row, newCol = col;
            
            switch (direction) {
                case "N": newRow -= i; break;  
                case "S": newRow += i; break;  
                case "E": newCol += i; break;  
                case "W": newCol -= i; break;  
            }
            
            if (newRow < 0 || newRow >= parkHeight || newCol < 0 || newCol >= parkWidth || park[newRow].charAt(newCol) == 'X') {
                return false; 
            }
        }
        return true; 
    }
}