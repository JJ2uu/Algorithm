package 프로그래머스;

public class 이천십육년 {

	public static void main(String[] args) {
		Solution10 sol = new Solution10();
		int a = 5;
		int b = 24;
		String answer = sol.solution(a, b);
		System.out.println(answer);
	}

}

class Solution10 {
    public String solution(int a, int b) {
        String answer = "";
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] month = {30, 29, 31, 30, 31, 30 ,31, 31, 30, 31, 30, 31};
        
        int total = 0;
        
        if (a > 1) {
        	for (int i = 0; i < a-1; i++) {
    			total += month[i];
    		}
            
		}
        
        total += b-1;
        
        answer = day[total%7];
        return answer;
    }
}
