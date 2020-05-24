package practice;

public class Solution1456 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		maxVowels("tryhard",4);
	}
  // sol in contest
//	public int maxVowels(String s, int k) {
//		  int ans=0,cur=0;
//	      for(int i=0;i<s.length()-k+1;i++)
//	      {
//	      	
//	      	if(i==0)
//	      	{
//	              String substr=s.substring(i, i+k);
//	      		for(char c:substr.toCharArray())
//	          	{
//	          		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
//	          			cur++;
//	          	}
//	      	}
//	      	else
//	      	{
//	              
//	      		if(s.charAt(i-1)=='a' || s.charAt(i-1)=='e' || s.charAt(i-1)=='i' || s.charAt(i-1)=='o' || s.charAt(i-1)=='u')
//	      			cur--;
//	      		if(s.charAt(i+k-1)=='a' || s.charAt(i+k-1)=='e' || s.charAt(i+k-1)=='i' || s.charAt(i+k-1)=='o' || s.charAt(i+k-1)=='u')
//	      			cur++;
//	              //System.out.println(s.charAt(i-1)+" "+s.charAt(i+k)+" "+cur);
//	      	}
//	      	ans= ans<cur ?cur:ans;
//	      }
//	      return ans;
//	  }
	//sol
//	public static int maxVowels(String s, int k) {
//		  int ans=0,cur=0;
//	      for(int i=0;i<s.length();i++)
//	      {
//	    	if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
//	    		cur++;
//	      	if(i>=k && (s.charAt(i-k)=='a' || s.charAt(i-k)=='e' || s.charAt(i-k)=='i' || s.charAt(i-k)=='o' || s.charAt(i-k)=='u'))
//		      	cur--;
//	      	ans= ans<cur ?cur:ans;
//	      	if (ans==k)
//	      		return k;
//	      }
//	      return ans;
//	  }
	//sol function
	public static int maxVowels(String s, int k) {
		  int ans=0,cur=0;
	      for(int i=0;i<s.length();i++)
	      {
	    	if(Isvowel(s.charAt(i)))
	    		cur++;
	      	if(i>=k && Isvowel(s.charAt(i-k)))
		      	cur--;
	      	ans= ans<cur ?cur:ans;
	      	if (ans==k)
	      		return k;
	      }
	      return ans;
	  }
	public static boolean Isvowel(char c){
		return  c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
	}

  
}
