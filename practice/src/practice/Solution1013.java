package practice;

public class Solution1013 {
		//sol1
		public boolean canThreePartsEqualSum(int[] A) {
	        int sum=0;
	        for (int a : A) 
				sum+=a;
			if(sum%3!=0)
				return false;
			int partsum=sum/3,tmp=0;
			for (int a : A) 
			{
				tmp+=a;
				if(tmp==partsum)
					tmp=0;
			}
			return tmp==0;
	    }
}
