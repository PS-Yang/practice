package practice;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution690 {
	//sol2
	public int getImportance(List<Employee> employees, int id) {
        int sum=0;
        HashMap<Integer,Employee> map=new HashMap<>();
        Queue<Integer> que=new LinkedList<>();
        for(Employee e:employees)
        	map.put(e.id, e);
        que.add(id);
        while(!que.isEmpty())
        {
        	Employee e=map.get(que.poll());
        	sum+=e.importance;
        	if(e.subordinates!=null)
        		for(int v:e.subordinates)
        			que.add(v);
        }
        return sum;
    }
	//sol1 
//	public int getImportance(List<Employee> employees, int id) {
//        int sum=0;
//        HashMap<Integer,List<Integer>> map=new HashMap<>();
//        HashMap<Integer,Integer> idvalue=new HashMap<>();
//        Queue<Integer> que=new LinkedList<>();
//        for(Employee e:employees)
//        {
//        	map.put(e.id, e.subordinates);
//        	idvalue.put(e.id, e.importance);
//        }
//        que.add(id);
//        while(!que.isEmpty())
//        {
//        	int n=que.poll();
//        	if(map.get(n)!=null)
//        		for(int v:map.get(n))
//        			que.add(v);
//        	sum=sum+idvalue.get(n);
//        }
//        
//        return sum;
//    }

}
//Employee info
class Employee {
 // It's the unique id of each node;
 // unique id of this employee
 public int id;
 // the importance value of this employee
 public int importance;
 // the id of direct subordinates
 public List<Integer> subordinates;
};