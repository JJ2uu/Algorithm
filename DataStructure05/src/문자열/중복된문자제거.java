package 문자열;

public class 중복된문자제거 {

	public static void main(String[] args) {
		String my_string = "We are the world";
		String[] str = my_string.split("");
		String answer = str[0];
		
		for (int i = 1; i < str.length; i++) {
			if (!answer.contains(str[i])) {
				answer += str[i];
			}
		}
		
		System.out.println(answer);
	}

}
