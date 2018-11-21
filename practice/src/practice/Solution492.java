package practice;

public class Solution492 {
	public int[] constructRectangle(int area) {
		if(area==1)
			return new int[]{1,1};
		int i=(int)Math.sqrt(area);
		for(;i>0;i--)
			if(area%i==0)
				break;
        return i==0 ? new int[]{-1,-1}:new int[]{area/i,i};
    }

}
