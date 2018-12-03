package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Solution952 {
	//sol2
	int max=0;
	public int largestComponentSize(int[] A) {
		boolean isprime[]=new boolean[100001];
		HashSet<Integer> primes=new HashSet<>();
		Arrays.fill(isprime, true);
		for(int i=2;i<100000;i++)
			if(isprime[i])
			{
				primes.add(i);
				for (int j=2;j*i<=100000;j++) 
					isprime[j*i]=false;
			}
		
		int N=A.length;
		int count[]=new int [N]; //用來計算SETSIZE
		int parent[]=new int [N];
		int primetoidx[]=new int [100001];
		Arrays.fill(primetoidx, -1);
		for(int i=0;i<N;i++)
		{
			count[i]=1;
			parent[i]=i;
		}
		for(int i=0;i<N;i++)
		{
			int a=A[i];
			for(int p:primes)
			{
				if(primes.contains(a)) //若a為質數
					p=a;
				if(a%p==0)
				{
					if(primetoidx[p]>-1)//若該質數已有idx
						union(parent,count,primetoidx[p],i);
					primetoidx[p]=i;
					while(a%p==0)
						a=a/p;
					
				}
				if(a==1)
					break;
			}
		}
//		for(int c:count)
//			System.out.print(c+" ");
//		System.out.println();
//		for(int c:parent)
//			System.out.print(c+" ");
//		System.out.println();
//		for(int i=0;i<20;i++)
//			System.out.print(primetoidx[i]+" ");
//		System.out.println();
//		System.out.println("---------------------");
		return max;
	}
	private int find(int parent[],int x){
		if(parent[x]!=x)
			parent[x]=find(parent,parent[x]);
		return parent[x];
	}
	private void union(int parent[],int count[],int x,int y){
		int par1=find(parent,x);
		int par2=find(parent,y);
		if(par1==par2)
			return;
		int c=count[par1]+count[par2];
		max=Math.max(max, c);
		parent[par1]=par2;
		count[par2]=c;
	}
	//sol1
//	public int largestComponentSize(int[] A) {
//		int N=A.length;
//		ArrayList<ArrayList<Integer>> factor=new ArrayList<>();
//		for(int a:A)
//		{
//			ArrayList<Integer> f=new ArrayList<>();
//			int x=2;
//			while(x*x<=a) //找平方跟小於a的質數
//			{
//				if(a%x==0)
//				{
//					while(a%x==0)
//						a=a/x;
//					f.add(x);
//				}
//				x++;
//			}
//			if(a>1 || f.isEmpty())
//				f.add(a);
//			factor.add(f);
//		}
//		
//		HashSet<Integer> prime=new HashSet<>();
//		for(ArrayList<Integer> f:factor)
//			for(int n:f)
//				prime.add(n);
//		int primeL[]=new int[prime.size()];
//		int m=0;
//		for (int x: prime)
//			primeL[m++]=x;
//		//建立prime to idx 
//		HashMap<Integer,Integer> primetoidx=new HashMap<>();
//		for(int i=0;i<primeL.length;i++)
//			primetoidx.put(primeL[i], i);
//		
//		DSU d=new DSU(primeL.length);
//		for(ArrayList<Integer> f:factor)
//			for(int x:f)
//				d.union(primetoidx.get(f.get(0)), primetoidx.get(x));
//		
//		int[] count = new int[primeL.length];
//        for (ArrayList<Integer> f: factor)
//            count[d.find(primetoidx.get(f.get(0)))]++;
//        
//        int ans = 0;
//        for (int x: count)
//            if (x > ans)
//                ans = x;
//        return ans;
//    }
//}
////UNION find
//class DSU{
//	int parent[];
//	public DSU(int N){
//		parent=new int[N];
//		for(int i=0;i<N;i++)
//			parent[i]=i;
//	}
//	public void union(int x,int y){
//		 parent[find(x)] = find(y);
//	}
//	public int find(int x){
//		if(parent[x]!=x)
//			  parent[x]=find(parent[x]);
//		return parent[x]; 
//	}
}
