package 프로그래머스기본;

public class 모음제거 {

	public static void main(String[] args) {
		Solution7 sol = new Solution7();
		String my_string = "nice to meet you";
		String answer = sol.solution(my_string);
		System.out.println(answer);
	}

}

class Solution7 {
    public String solution(String my_string) {
        String answer = "";
        String[] s = {"a", "e", "i", "o", "u"};
        
        for (int i = 0; i < s.length; i++) {
			if (my_string.contains(s[i])) {
				my_string = my_string.replace(s[i], "");
			}
		}
        answer = my_string;
        return answer;
    }
}

// answer = my_string.replaceAll("[aeiou]", "");
