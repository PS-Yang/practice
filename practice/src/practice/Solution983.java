package practice;

public class Solution983 {
	//sol2 以天數分
//	public int mincostTickets(int[] days, int[] costs) {
//        boolean day[]=new boolean[366];
//        for (int d:days) 
//			day[d]=true;
//        
//        int total[]=new int [366];
//        total[0]=0;
//        for (int i = 1; i < total.length; i++) 
//        {
//        	if(!day[i])
//        	{
//        		total[i]=total[i-1];
//        		continue;
//        	}
//        	total[i]=total[i-1]+costs[0];
//        	total[i]=Math.min(total[i], total[Math.max(i-7, 0)] + costs[1]);
//        	total[i]=Math.min(total[i], total[Math.max(i-30, 0)] + costs[2]);
//			
//		}
//        return total[365];
//    }
	//sol1 直接用ARRAY分
	public int mincostTickets(int[] days, int[] costs) {
        int total[]=new int [days.length+1];
        total[0]=0;
        int idx7=0,idx30=0;
        for (int i = 0; i < days.length; i++) 
        {
        	total[i+1]=costs[0]+total[i];
        	while (days[i]-days[idx7] >= 7) 
        		idx7++;
        	total[i+1]=Math.min(total[i+1], total[idx7] + costs[1]);
        	
        	while (days[i]-days[idx30] >= 30) 
        		idx30++;
        	total[i+1]=Math.min(total[i+1], total[idx30] + costs[2]);
			
		}
        return total[total.length-1];
    }
	//WA
//	public int mincostTickets(int[] days, int[] costs) {
//        int total[]=new int [days.length+1];
//        for (int i = 1; i < days.length; i++) 
//			total[i]=costs[0]+total[i-1];
//
//        for (int i = 0; i < days.length; i++) 
//        {
//        	total[i+1]=Math.min(costs[0]+total[i], total[i]);
//        	int j=i;
//        	while (j<days.length && days[j]-days[i] < 7) 
//				j++;
//			total[j]=Math.min(total[j], total[i]+(j-i+1)*costs[1]);
//			
//        	int k=i;
//        	while (k<days.length && days[k]-days[i] < 30) 
//				k++;
//			total[k]=Math.min(total[k], total[i]+(k-i+1)*costs[2]);
//		}
//        return total[total.length-1];
//    }
}
