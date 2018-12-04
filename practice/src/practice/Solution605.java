package practice;

public class Solution605 {
	public boolean canPlaceFlowers(int[] flowerbed, int n) {
		int count=0;
		int idx=0;
		int N=flowerbed.length;
		while(idx<N)
		{
			while((idx+1<N && flowerbed[idx]==0 && flowerbed[idx+1]==0)
				  ||(idx==N-1 && flowerbed[idx]==0))
			{
				idx=idx+2;
				count++;
			}
			if(count>=n)
				break;
			
			while(idx<N && flowerbed[idx]==1)
				idx++;
			idx++;
		}
		return count>=n;
    }
//	public boolean canPlaceFlowers(int[] flowerbed, int n) {
//		int count=0;
//		int idx=0;
//		int N=flowerbed.length;
//		while(idx<N)
//		{
//			while(idx<N && flowerbed[idx]==1)
//				idx++;
//			idx++;
//			while(idx+1<N && flowerbed[idx]==0 && flowerbed[idx+1]==0)
//			{
//				idx=idx+2;
//				count++;
//			}
//			if(count==n)
//				break;
//		}
//		return count==n;
//    }
}
