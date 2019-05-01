package practice;


public class Solution1025 {
	
	//sol1
	public boolean divisorGame(int N) {
        return N%2==0;
    }
	
	//WA
//	public boolean divisorGame(int N) {
//		if(N==1)
//			return false;
//		else if(N==2)
//        	return true;
//        else 
//        {
//        	List<Integer> list=new ArrayList<>();
//        	for (int i = (int)Math.sqrt(N) ; i > 0 ; i--) 
//				if(N%i==0)
//					list.add(N-i);
//        	boolean ans=false;
//        	for (int x:list) {
//				ans=ans || divisorGame(x);
//			}
//        	return !ans;
//        }
//        
//    }
}
