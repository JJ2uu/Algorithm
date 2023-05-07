package 프로그래머스;

public class 숫자문자열과영단어 {

	public static void main(String[] args) {
		int answer = 0;
		String s = "23four5six7";
	
		String[] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

		for (int i = 0; i < num.length; i++) {
			if (s.contains(num[i])) { 
				s = s.replace(num[i], String.valueOf(i));
			}
		}
		
		answer = Integer.parseInt(s);
		
		System.out.println(answer);

	}

}
