package practice;

public class Solution263 {
	public boolean isUgly(int num) {
		if(num<1)
			return false;
		if(num==1)
			return true;
		while(num>2)
		{
			if(num%5==0)
				num=num/5;
			else if(num%3==0)
				num=num/3;
			else if(num%2==0)
				num=num/2;
			else
				return false;
		}
        return true;
    }
}
