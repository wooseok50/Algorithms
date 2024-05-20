class Solution {
    public int[] solution(String[] wallpaper) {
        int minX, minY;
        int maxX, maxY;
        
        minX = minY = 50;
        maxX = maxY = 0;
        
        for(int i =0; i< wallpaper.length; i++) {
            for (int j =0 ; j < wallpaper[i].length(); j++) {
                if(wallpaper[i].charAt(j) == '#') {
                    minX = Math.min(minX, i);
                    minY = Math.min(minY, j);
                    maxX = Math.max(maxX, i);
                    maxY = Math.max(maxY, j);
                }
            }
        }
        return new int[]{minX, minY, maxX+1, maxY+1};
    }
}