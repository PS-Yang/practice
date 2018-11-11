package practice;

import java.util.Stack;

public class Solution935 {
	private int MOD=1000000007;
	public int knightDialer(int N) {
		if(N<1)
			return 0;
		int map[][]={{4,6},{6,8},{7,9},{4,8},{0,3,9},{},{0,1,7},{2,6},{1,3},{2,4}};
		long count[]={1,1,1,1,1,1,1,1,1,1};
		
        for(int i=2;i<=N;i++)
        {
        	long tmp[]=new long[10];
        	// for example=> tmp[0]=count[4]+count[6] , tmp[1]=count[6]+count[8] ...
        	for(int j=0;j<map.length;j++)
        	{
        		for(int k=0;k<map[j].length;k++)
        		{
        			tmp[j]=tmp[j]+count[map[j][k]]%MOD;
        		}
        	}
        	count=tmp;
        }
        long ans=0;
        for(int i=0;i<10;i++)
        	ans=(ans+count[i])%MOD;
		return (int)ans;
    }

}
