package 문자열;

public class 문자열다루기기본 {

	public static void main(String[] args) {
		String s = "a234";
		
		boolean answer = true;
		
		if (s.length() == 4 || s.length() == 6) {
			for (char c : s.toCharArray()) {
				if ( c < '0' || c > '9') {
					answer = false;
					break;
				}
			}
		} else {
			answer = false;
		}
		
		System.out.println(answer);
	}

}
