package 문자열;

public class 문자열안에문자열포함 {

	public static void main(String[] args) {
		String str = "abcdefgaaabbbccc";
		String str2 = "6CD";
		int answer = 2;
		if (str.contains(str2)) {
			answer = 1;
		}
		System.out.println(answer);
	}

}
