package practice;

public class Solution1079 {
	public int numTilePossibilities(String tiles) {
        int count[]=new int[26];
        for (char c:tiles.toCharArray()) 
			count[c-'A']++;
		return dfs(count);
    }
	private int dfs(int count[]) {
		int sum=0;
		for (int i = 0; i < count.length; i++) 
		{
			if (count[i]==0) 
				continue;
			count[i]--;
			sum++;
			sum+=dfs(count);
			count[i]++;
		}
		
		return sum;
	}
}
