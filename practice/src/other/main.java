package other;

import practice2.SolutionC17_1;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s=new Solution();
//		int A[]=new int [100000];
//		for(int i=0;i<A.length;i++)
//			A[i]=1;
//		System.out.println(s.solution(new int []{1,5,2,2}));
//		System.out.println(s.solution(new int []{1,2,7,1}));
//		System.out.println(s.solution(new int []{3, 4, 7, 7, 6, 6}));
//		System.out.println(s.solution(new int []{80, 80, 1000000000, 80, 80, 80, 80, 80, 80, 123456789}));
//		System.out.println(s.solution(new int []{80,80,80,80,80,80,80,80,80,80}));
//		System.out.println(s.solution(new int []{1,2,3,4,5,6,7,8,9,10}));
//		System.out.println(s.solution(A));
		
//		String str="Sun 10:00-20:00\nFri 05:00-10:00\nFri 16:30-23:50\nSat 10:00-24:00\nSun 01:00-04:00\nSat 02:00-06:00\nTue 03:30-18:15\nTue 19:00-20:00\nWed 04:25-15:14\nWed 15:14-22:40\nThu 00:00-23:59\nMon 05:00-13:00\nMon 15:00-21:00";
//		String str2="Mon 01:00-23:00\nTue 01:00-23:00\nWed 01:00-23:00\nThu 01:00-23:00\nFri 01:00-23:00\nSat 01:00-23:00\nSun 01:00-21:00";
//		System.out.println(s.solution2(str)); //505
//		System.out.println(s.solution2(str2));//180
		String[] T1={"test1a","test2","test1b","test1c","test3"};
		String[] R1={"Wrong answer","OK","Runtime error","OK","Time limit exceeded"};
		String[] T2={"test1","test3","test2","test4b","test4a"};
		String[] R2={"Wrong answer","OK","OK","Runtime error","OK"};
		String[] T3={"test10","test3","test2","test4b","test4a","test1","test5","test6","test7","test8","test9"};
		String[] R3={"OK","OK","OK","Runtime error","OK","OK","OK","OK","OK","OK","OK"};
		System.out.println(s.solution3(T1,R1));
		System.out.println(s.solution3(T2,T2));
		System.out.println(s.solution3(T3,R3));
	}

}
