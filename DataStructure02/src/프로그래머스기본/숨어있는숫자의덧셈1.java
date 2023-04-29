package 프로그래머스기본;

public class 숨어있는숫자의덧셈1 {

	public static void main(String[] args) {
		Solution10 sol = new Solution10();
		String my_string = "aAb1B2cC34oOp";
		int answer = sol.solution(my_string);
		System.out.println(answer);
	}

}
class Solution10 {
    public int solution(String my_string) {
        int answer = 0;
        my_string = my_string.replaceAll("[^0-9]", "");
        for(int i=0; i<my_string.length(); i++) {
            answer += Integer.parseInt(String.valueOf(my_string.charAt(i)));
        }  
        return answer;
    }
}
