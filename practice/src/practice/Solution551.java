package practice;

public class Solution551 {
	public boolean checkRecord(String s) {
		return  s.indexOf("A") == s.lastIndexOf("A") &&  !s.contains("LLL");
    }
}
