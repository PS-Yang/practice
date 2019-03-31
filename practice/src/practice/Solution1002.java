package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1002 {
	//sol2
	public List<String> commonChars(String[] A) {
        List<String> ans=new ArrayList<>();
        int count[]=new int[26];
        Arrays.fill(count, Integer.MAX_VALUE);
        for (String s:A) 
        {
        	int tmp[]=new int[26];
        	for (int i = 0; i < s.length(); i++) 
        		tmp[s.charAt(i)-'a']++;		
        	for (int j = 0; j < 26; j++) 
				count[j]=Math.min(count[j], tmp[j]);
			
		}
        for (int j = 0; j < 26; j++) 
        	System.out.println(count[j]);
        for (int i = 0; i < 26; i++) 
        	for (int j = 0; j < count[i]; j++) 
        		ans.add((char)(i+97)+"");	
		
        return ans;
    }
	//sol1
//	public List<String> commonChars(String[] A) {
//        List<String> ans=new ArrayList<>();
//        int count[][]=new int[A.length][26];
//        int idx=0;
//        for (String s:A) 
//        {
//        	for (int i = 0; i < s.length(); i++) 
//        		count[idx][s.charAt(i)-'a']++;		
//			idx++;
//		}
//        for (int i = 0; i < 26; i++) 
//        {
//        	int tmp=Integer.MAX_VALUE;
//			for (int j = 0; j < A.length; j++) 
//			{
//				tmp=Math.min(tmp, count[j][i]);
//				if(tmp==0)
//					continue;
//			}
//			for (int j = 0; j < tmp; j++) 
//				ans.add((char)(i+97)+"");
//		}
//        return ans;
//    }
}
