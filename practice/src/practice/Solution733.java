package practice;

public class Solution733 {
	public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
		int color=image[sr][sc];
		if(color==newColor)
			return image;
		fill(image, sr, sc, newColor, color);
        return image;
    }
	private void fill(int[][] image, int sr, int sc, int newColor, int color) {
		if (image[sr][sc] == color) 
		{
			image[sr][sc] = newColor;
	        if(sr+1 <image.length)
	        	fill(image, sr + 1, sc, newColor, color);
	        if(sr > 0)
	        	fill(image, sr - 1, sc, newColor, color);
	        if(sc+1 <image[0].length)
	        	fill(image, sr, sc + 1, newColor, color);
	        if(sc > 0)
	        	fill(image, sr, sc - 1, newColor, color);
		} 
	}
	
//	private void fill(int[][] image, int sr, int sc, int newColor, int color) {
//		if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] != color) 
//			return;
//        image[sr][sc] = newColor;
//        fill(image, sr + 1, sc, newColor, color);
//        fill(image, sr - 1, sc, newColor, color);
//        fill(image, sr, sc + 1, newColor, color);
//        fill(image, sr, sc - 1, newColor, color);
//	}
}
