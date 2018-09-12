package practice;

public class Solution11 {
	// 只考慮最外圍的兩個點，並且逐漸縮小範圍
	public int maxArea(int[] height) {
		int ans=0;
		int begin=0;
		int end=height.length-1;
		while(end>begin)
		{
			if(height[end]>height[begin])
			{
				int area=height[begin]*(end-begin);
				if(area>ans)
					ans=area;
				begin++;
			}
			else
			{
				int area=height[end]*(end-begin);
				if(area>ans)
					ans=area;
				end--;
			}
		}
		return ans;
    }
//  brute force : consider every point's area 
//	time o(N*N) 
//	public int maxArea(int[] height) {
//		int ans=0;
//		for(int i=0;i<height.length;i++)
//		{
//			for(int j=1;j<height.length;j++)
//			{
//				if(height[i]>height[j])
//				{
//					int temp=height[j]*(j-i);
//					if(ans<temp)
//						ans=temp;
//				}
//				else
//				{
//					int temp=height[i]*(j-i);
//					if(ans<temp)
//						ans=temp;
//				}
//			}
//		}
//		return ans;
//    }
}
