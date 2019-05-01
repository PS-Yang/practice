package practice;

import java.util.List;
import java.util.ArrayList;

public class Solution1023 {
	//sol2
	public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> ans=new ArrayList<>();
        for(String query:queries)
            ans.add(isMatch(query,pattern));
        return ans;
    }
    
     public Boolean isMatch(String query, String pattern){
            int cur=0;
            int len=pattern.length();
            for(char c:query.toCharArray())
            {
                
                if(cur<len && pattern.charAt(cur)==c)
                    cur++;
                else if(c-'A' >= 0 && c-'A' <= 25) //大寫
                    return false;
            }
            return cur==pattern.length();
     }
	//sol1
//	public List<Boolean> camelMatch(String[] queries, String pattern) {
//		List<Boolean> ans=new ArrayList<>();
//        for(String query:queries)
//        {
//            int cur=0;
//            boolean flag=false;
//            int len=pattern.length();
//            for(char c:query.toCharArray())
//            {
//                if(c-'A' >= 0 && c-'A' <= 25) //大寫
//                {
//                    if(cur<len && pattern.charAt(cur)==c)
//                        cur++;
//                    else
//                        flag=true;
//                }
//                else //小寫
//                {
//                    if(cur<len && pattern.charAt(cur)==c)
//                        cur++;
//                }
//            }
//            if(!flag && cur==pattern.length())
//                ans.add(true); 
//            else
//                ans.add(false);
//             
//        } 
//        return ans;
//    }
}
