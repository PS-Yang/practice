package practice;

public class Solution1455 {
	//using substring
//	 public int isPrefixOfWord(String sentence, String searchWord) {
//	        
//	    	String str[]=sentence.split(" ");
//	    	int len=searchWord.length();
//	    	int i=1;
//	    	for(String s:str)
//	        {
//	    		if(s.length()>=len && s.substring(0, len).equals(searchWord))
//	    			return i;
//	        	i++;
//	        }
//	    	return -1;
//	 }
	// using startwith
	public int isPrefixOfWord(String sentence, String searchWord) {
    	String str[]=sentence.split(" ");
    	int i=1;
    	for(String s:str)
        {
    		if(s.startsWith(searchWord))
    			return i;
        	i++;
        }
    	return -1;
 }
}
