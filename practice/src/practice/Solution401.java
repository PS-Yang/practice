package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution401 {
	public List<String> readBinaryWatch(int num) {
		List<String> ans=new ArrayList<>();
		for(int h=0;h<12;h++)
			for(int m=0;m<60;m++)
				if(Integer.bitCount(h)+Integer.bitCount(m)==num)
					ans.add(String.format("%d:%02d", h, m));
		return ans;
	}
}
	//sol 1
//	private String hour[][]={{"0"},{"1","2","4","8"},{"3","5","6","9","10"},{"7","11"}};
//	private String min[][]={{"00"},{"01","02","04","08","16","32"},
//			{"03","05","06","09","10","12","17","18","20","24","33","34","36","40","48"},
//			{"07","11","13","14","19","21","22","25","26","28","35","37","38","41","42","44","49","50","52","56"},
//			{"15","23","27","29","30","39","43","45","46","51","53","54","57","58"},
//            {"31","47","55","59"}};
//	public List<String> readBinaryWatch(int num) {
//		List<String> ans=new ArrayList<>();
//		if(num>8 || num<0)
//			return ans;
//		for(int i=0;i<=3 && i<=num;i++)
//		{
//			for(String h:hour[i])
//				if(num-i<=5)
//					for(String m:min[num-i])
//						ans.add(h+":"+m);
//		}
//		return ans;
//    }
}
