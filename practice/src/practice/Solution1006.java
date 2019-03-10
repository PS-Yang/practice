package practice;

public class Solution1006 {
	//sol2 推導數學後得證
	public int clumsy(int N) {
		if(N<=2)
			return N;
		if(N<=4)
			return N+3;
		if((N-4)%4==0)
			return N+1;
		else if((N-4)%4<=2)
			return N+2;
		else
			return N-1;
    }
	//sol1 counting 
//	public int clumsy(int N) {
//		int sum=0,flag=0,tmp=N;
//		N--;
//        while (N!=0) {
//        	if (flag%4==0) {
//        		tmp*=N;
//			}
//        	else if (flag%4==1) {
//				tmp/=N;
//			}
//        	else if (flag%4==2) {
//				sum+=tmp;
//				sum+=N;
//				tmp=0;
//			}
//        	else if (flag%4==3) {
//				tmp=-N;
//			}
//        	N--;
//        	flag++;
//		}
//        sum+=tmp;
//        return sum;
//    }
}
