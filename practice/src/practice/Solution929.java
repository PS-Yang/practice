package practice;

import java.util.HashSet;

public class Solution929 {
	public int numUniqueEmails(String[] emails) {
        HashSet<String> set=new HashSet<>();
		for(String s:emails)
		{
			String str[]=s.split("@");
			String first=str[0].replaceAll("\\.", "");
			first=first.substring(0,first.indexOf("+"));
//			System.out.println(first+"@"+str[1]);
			set.add(first+"@"+str[1]);
		}
		return set.size();
    }
}
