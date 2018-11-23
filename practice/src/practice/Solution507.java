package practice;

import java.util.HashSet;

public class Solution507 {
	//sol 1
	public boolean checkPerfectNumber(int num) {
		if(num<2)
			return false;
        int count=1;
        for(int i=2;i<=Math.sqrt(num);i++)
        	if(num%i==0)
        		count=count+i+(num/i);
        
        return count==num;
    }
}
