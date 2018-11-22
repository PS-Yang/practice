package practice;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;


public class Solution500 {
	//sol2
	public String[] findWords(String[] words) {
		HashMap<Character,Integer> map=new HashMap<>();
		String s[]={"qwertyuiopQWERTYUIOP","asdfghjklASDFGHJKL","zxcvbnmZXCVBNM"};
		for(int i=0;i<3;i++)
			for(int j=0;j<s[i].length();j++)
				map.put(s[i].charAt(j), i);
		
		List<String> list=new ArrayList<>();		
        for(String word:words)
        {
        	int n=map.get(word.charAt(0));
        	boolean flag=true ;
        	for(int i=1;i<word.length();i++)
        		if(n!=map.get(word.charAt(i)))
        		{
        			flag=false;
        			break;
        		}
        	if(flag)
        		list.add(word);
        }
        return list.toArray(new String[0]);
    }
	//sol1
//	public String[] findWords(String[] words) {
//		HashMap<Character,Integer> map=new HashMap<>();
//		String s[]={"qwertyuiopQWERTYUIOP","asdfghjklASDFGHJKL","zxcvbnmZXCVBNM"};
//		for(int i=0;i<3;i++)
//			for(int j=0;j<s[i].length();j++)
//				map.put(s[i].charAt(j), i);
//				
//		
//        boolean flag[]=new boolean [words.length];
//        int len=0;
//        for(int j=0;j<words.length;j++)
//        {
//        	int n=map.get(words[j].charAt(0));
//        	flag[j]=true ;
//        	for(int i=1;i<words[j].length();i++)
//        		if(n!=map.get(words[j].charAt(i)))
//        		{
//        			flag[j]=false;
//        			break;
//        		}
//        	if(flag[j])
//        		len++;
//        }
//        String ans[]=new String [len];
//        int i=0;
//        for(int j=0;j<flag.length;j++)
//        {
//        	if(flag[j])
//        	{
//        		ans[i]=words[j];
//        		i++;
//        	}
//        }
//        return ans;
//    }
}
