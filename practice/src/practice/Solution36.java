package practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Solution36 {
	//4版Set修改
	public boolean isValidSudoku(char[][] board) {
		HashSet<String> set = new HashSet<String>();
		for(int i=0;i<board.length;i++)
		{
			for(int j=0;j<board[i].length;j++)
			{
				if(board[i][j]!='.')
				{
					if(!set.add("row"+i+board[i][j]) || !set.add("column"+j+board[i][j])||!set.add("boxes"+(i/3)+(j/3)+board[i][j]))
						return false;
				}			
			}
		}
		return true;
    }
//	//3版Set
//	public boolean isValidSudoku(char[][] board) {
//		HashSet<Character> row = new HashSet<Character>();
//	    HashSet<Character> column = new HashSet<Character>();
//	    HashSet<Character> box1 = new HashSet<Character>();
//	    HashSet<Character> box2 = new HashSet<Character>();
//	    HashSet<Character> box3 = new HashSet<Character>();
//		for(int i=0;i<board.length;i++)
//		{
//			for(int j=0;j<board[i].length;j++)
//			{
//				if(board[i][j]!='.' && !row.add(board[i][j]))
//					return false;
//				if(board[j][i]!='.' && !column.add(board[j][i]))
//					return false;
//				if(j<3 && board[i][j]!='.' && !box1.add(board[i][j]))
//						return false;
//				if(j>=3 && j<6 && board[i][j]!='.' && !box2.add(board[i][j]))
//					return false;
//				if(j>=6 && j<9 && board[i][j]!='.' && !box3.add(board[i][j]))
//					return false;
//			}
//			row.clear();
//			column.clear();
//			if(i%3==2)
//			{
//				box1.clear();
//				box2.clear();
//				box3.clear();
//			}
//		}
//		return true;
//    }
	
//	//2版HashMap+set 修改
//	public boolean isValidSudoku(char[][] board) {
//        HashMap<String,Set<Character>> map=new HashMap<>();
//		for(int i=0;i<board.length;i++)
//		{
//			for(int j=0;j<board[i].length;j++)
//			{
//				//row hashset
//				if(map.get("row"+i)==null)
//				{
//					Set<Character> temp=new HashSet<>();
//					temp.add(board[i][j]);
//					map.put("row"+i, temp);
//				}
//				else if(board[i][j]!='.' && !map.get("row"+i).add(board[i][j]))
//					return false;
//
//				//column hashset
//				if(map.get("column"+j)==null)
//				{
//					Set<Character> temp=new HashSet<>();
//					temp.add(board[i][j]);
//					map.put("column"+j, temp);
//				}
//				else if(board[i][j]!='.' && !map.get("column"+j).add(board[i][j]))
//					return false;
//					
//				//box hashset
//				if(map.get("box"+(i/3)+""+(j/3))==null)
//				{
//					Set<Character> temp=new HashSet<>();
//					temp.add(board[i][j]);
//					map.put("box"+(i/3)+""+(j/3), temp);
//				}
//				else if(board[i][j]!='.' &&!map.get("box"+(i/3)+""+(j/3)).add(board[i][j]))
//					return false;	
//			}
//
//		}
//		return true;
//    }
//	//1版 HashMap+set
//	public boolean isValidSudoku(char[][] board) {
//        HashMap<String,Set<Character>> map=new HashMap<>();
//		for(int i=0;i<board.length;i++)
//		{
//			for(int j=0;j<board[i].length;j++)
//			{
//				//row hashset
//				if(map.get("row"+i)==null)
//				{
//					Set<Character> temp=new HashSet<>();
//					temp.add(board[i][j]);
//					map.put("row"+i, temp);
//				}
//				else if(board[i][j]=='.' || !map.get("row"+i).contains(board[i][j]))
//				{
//					map.get("row"+i).add(board[i][j]);
//				}
//				else
//					return false;
//				//column hashset
//				if(map.get("column"+j)==null)
//				{
//					Set<Character> temp=new HashSet<>();
//					temp.add(board[i][j]);
//					map.put("column"+j, temp);
//				}
//				else if(board[i][j]=='.' || !map.get("column"+j).contains(board[i][j]))
//				{
//					map.get("column"+j).add(board[i][j]);
//				}
//				else
//					return false;
//				//box hashset
//				if(map.get("box"+(i/3)+""+(j/3))==null)
//				{
//					Set<Character> temp=new HashSet<>();
//					temp.add(board[i][j]);
//					map.put("box"+(i/3)+""+(j/3), temp);
//				}
//				else if(board[i][j]=='.' || !map.get("box"+(i/3)+""+(j/3)).contains(board[i][j]))
//				{
//					map.get("box"+(i/3)+""+(j/3)).add(board[i][j]);
//				}
//				else
//					return false;
//			}
//
//		}
//		return true;
//    }
}
