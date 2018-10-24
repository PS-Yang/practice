package practice;

public class Solution292 {
	public boolean canWinNim(int n) {
		if(n<1)
			return false;
        else
			return n%4!=0;
    }
	//sol1.
//	public boolean canWinNim(int n) {
//		if(n<1)
//			return false;
//        else if(n%4==0)
//			return false;
//		else
//			return true;
//    }
}
