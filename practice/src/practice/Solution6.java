package practice;

public class Solution6 {
	public String convert(String s, int numRows) {
        StringBuilder ans = new StringBuilder();
		int count=0;
		int size =2*numRows-2; //4
		if(size!=0)
			count =s.length()/size;
		if(numRows==1)
			return s;
		for(int j=0;j<numRows;j++)
		{
			for(int i=0;i<=count;i++)
			{
				if((j==0||j==numRows-1) && i*size+j<s.length()) //頭尾情況 只有一個數字
				{
					ans.append(s.substring(i*size+j,i*size+j+1));
				}
				else 
				{
					if(i*size+j<s.length())
						ans.append(s.substring(i*size+j,i*size+j+1));
					if(i*size+size-j<s.length())
						ans.append(s.substring(i*size+size-j,i*size+size-j+1));
				}
				
			}
		}
        return ans.toString();
    }
}
