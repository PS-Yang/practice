package practice;

public class Solution189 {
	//3. 使用inverse ，rotate K次 都是inverse 3次為正確答案  time O(N)  space O(1)
	public void rotate(int[] nums, int k) {
		k=k%nums.length;
		inverse(nums,0,nums.length-1);
		inverse(nums,0,k-1);
		inverse(nums,k,nums.length-1);
    }
	public void inverse(int[] nums, int begin,int end){
		while(end>begin)
		{
			int tmp=nums[end];
			nums[end]=nums[begin];
			nums[begin]=tmp;
			begin++;
			end--;
		}
		
	}
	//2. 循環移動，並計算次數 time O(N)  space O(1)
//	public void rotate(int[] nums, int k) {
//		int len=nums.length;
//		k=k%len;
//		int count=0;
//		for(int i=0;count<nums.length;i++)
//		{
//			int begin=i;
//			int current=nums[i];
//			int next=(i+k)%len;
//			do
//			{
//				int nextn=nums[next];
//				nums[next]=current;
//				current=nextn;
//				next=(next+k)%len;
//                count++;
//			}while(begin!=next);
//			nums[i]=current;
//			count++;
//		}
//    }
	
//	//1. using extra array  time O(N)  space O(N)
//	public void rotate(int[] nums, int k) {
//		k=k%nums.length;
//		int tmp[]=new int[nums.length];
//		for(int i=0;i<nums.length;i++)
//			tmp[i]=nums[i];
//		for(int i=0;i<nums.length;i++)
//		{
//			nums[(i+k)%nums.length]=tmp[i];
//		}
//    }
}
