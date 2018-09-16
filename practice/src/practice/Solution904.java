package practice;

public class Solution904 {
	public int totalFruit(int[] tree) {
        int total=0;
        if(tree.length<3) 
        	return tree.length;
        for(int i=0;i<tree.length-total;i++)
        {
        	int a=tree[i];
        	int counta=0;
        	while(i+1<tree.length && tree[i]==tree[i+1])
        	{
        		counta++;
        		i++;
        	}
        	if(i==tree.length-1 && counta+1>total) //only one element
        	{
        		total=counta+1;
        		break;
        	}
        	int b=tree[i+1];
        	int countb=0;
        	while(i+countb<tree.length && (tree[i+countb]==a || tree[i+countb]==b))
        		countb++;
        	if(total<counta+countb)
        		total=counta+countb;
        }
		return total;
    }
//	//1版
//	public int totalFruit(int[] tree) {
//        int total=0;
//        if(tree.length<3)
//        	return tree.length;
//        for(int i=0;i<tree.length-total;i++)
//        {
//        	int a=tree[i];
//        	int temp_total=0;
//        	while(i+1<tree.length && tree[i]==tree[i+1])
//        	{
//        		temp_total++;
//        		i++;
//        	}
//        	if(i+1>=tree.length)
//        	{
//        		if(temp_total+1>total)
//        			total=temp_total+1;
//        		break;
//        	}
//        	int b=tree[i+1];
//        	int c=0;
//        	while(i+c<tree.length && (tree[i+c]==a || tree[i+c]==b))
//        	{
//        		c++;
//        	}
//        	temp_total=temp_total+c;
//        	if(total<temp_total)
//        		total=temp_total;
//        }
//		return total;
//    }
}
