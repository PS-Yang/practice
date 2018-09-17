package practice;

public class SolutionC1 {
	public int solution(int N) {
        // write your code in Java SE 8
		int ans=0;
		int count=0;
		boolean flag=false;
		while(N!=0)
		{
//			System.out.println(N);
			if(N%2==0)
				count++;
			else
			{
				if(count>ans && flag)
					ans=count;
				flag=true;
				count=0;
			}
			N=N/2;
		}
		return ans;
    }

}
