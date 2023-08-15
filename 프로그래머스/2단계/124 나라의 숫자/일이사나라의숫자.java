package 프로그래머스;

public class 일이사나라의숫자 {

	public static void main(String[] args) {
		int n = 4;
		Solution51 sol = new Solution51();
		System.out.println(sol.solution(n));
	}

}

class Solution51 {
    public String solution(int n) {
		StringBuilder sb = new StringBuilder();
        
	    while(n > 0) {
		    if (n%3 == 0) {
		    	sb.insert(0, "4");
				n = n - 1;
			} else if (n%3 == 1) {
				sb.insert(0, "1");
			} else {
				sb.insert(0, "2");
			}
		    n = n/3;
	    }
	        
	    return sb.toString();
    }
}
