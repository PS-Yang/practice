package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Solution12 {
	private int [] numarray={1000,900,500,400,100,90,50,40,10,9,5,4,1};
	private HashMap<Integer, String> map = new HashMap<Integer, String>(){{
		put(1000,"M");
		put(900,"CM");
		put(500,"D");
		put(400,"CD");
		put(100,"C"); 
		put(90,"XC");
		put(50,"L"); 
		put(40,"XL");
		put(10,"X"); 
		put(9,"IX"); 
		put(5,"V"); 
		put(4,"IV"); 
		put(1,"I");  	
	}};
	 public String intToRoman(int num) {
		 StringBuilder sb=new StringBuilder();
		 for(int n:numarray)
		 {
			 while(num>=n)
			 {
				 sb.append(map.get(n));
				 num=num-n;
			 }
			 
		 }
		 return sb.toString();
	 }
	 // 2. 使用arraylist
//	 public String intToRoman(int num) {
//		 ArrayList<Integer> nums=new ArrayList<>();
//		 int count=1;
//		 while(num>0)
//		 {
//			 int n=num%10;
//			 boolean flag=false;
//			 if(n>4 && n<9)
//			 {
//				 n=n-5;
//				 flag=true;
//			 }
//			 if(n==4 || n==9)
//				 nums.add(n*count);
//			 else 
//			 {
//				 for(int i=1;i<=n;i++)
//					 nums.add(1*count);
//			 }
//			 if(flag)
//				 nums.add(5*count);
//			 num=num/10;
//			 count=count*10;
//		 }
//	//	 System.out.println(nums);
//		 StringBuilder sb=new StringBuilder();
//		 for(int i=nums.size()-1;i>=0;i--)
//		 {
//			 sb.append(map.get(nums.get(i)));
//		 }
//		 return sb.toString();
//	 }
	 //1. HashMap只使用 I,V,X,L,C,D,M等情況 並未考慮 9,4
//	 public String intToRoman(int num) {
//		 ArrayList<Integer> nums=new ArrayList<>();
//		 int count=1;
//		 while(num>0)
//		 {
//			 int n=num%10;
//			 if(n==9 || n==4)
//			 {
//				 nums.add((n+1)*count);
//				 nums.add(1*count);
//			 }
//			 else if(n>0 && n<4)
//			 {
//				 for(int i=1;i<=n;i++)
//					 nums.add(1*count);
//			 }
//			 else if(n>4 && n<9)
//			 {
//				 n=n-5;
//				 for(int i=1;i<=n;i++)
//					 nums.add(1*count);
//				 nums.add(5*count);
//			 }
//			 num=num/10;
//			 count=count*10;
//		 }
//		 StringBuilder sb=new StringBuilder();
//		 for(int i=nums.size()-1;i>=0;i--)
//		 {
//			 sb.append(map.get(nums.get(i)));
//		 }
//		 return sb.toString();
//	 }
}
