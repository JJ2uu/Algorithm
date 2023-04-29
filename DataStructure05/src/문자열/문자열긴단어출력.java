package 문자열;

public class 문자열긴단어출력 {

	public static void main(String[] args) {
		String s = "i am a boy";
		String answer = "";
		String[] str = s.split(" ");
		
		int max = str[0].length();
		
		String maxStr = str[0];
		
		for (String x : str) {
			if (x.length() > max) {
				maxStr = x;
			}
		}
		answer = maxStr;
		System.out.println(answer);
		
	}

}
