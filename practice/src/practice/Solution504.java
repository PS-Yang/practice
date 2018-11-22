package practice;

public class Solution504 {
//	//sol1
	public String convertToBase7(int num) {
		if(num==0)
			return "0";
        StringBuilder sb=new StringBuilder();
        boolean flag=false;
        if(num<0)
        {
        	flag=true;
        	num=-num;
        }
        while(num>0)
        {
        	sb.append(num%7);
        	num=num/7;
        }
        if(flag)
        	sb.append("-");
        return sb.reverse().toString();
    }
	//sol2
//	public String convertToBase7(int num) {
//		return Integer.toString(num,7);
//    }
}
