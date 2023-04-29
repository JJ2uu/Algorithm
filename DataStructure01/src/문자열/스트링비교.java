package 문자열;

public class 스트링비교 {

	public static void main(String[] args) {
		String s = "정길동";
		String s2 = "정길동";
		
		// String은 출력할 때, 그 주소가 가리키는 char들을 프린트하게 재정의 되어있는 객체(toString() 오버라이드)
		System.out.println(s);
		System.out.println(s2);
		
		System.out.println(s.equals(s2));
		System.out.println(s == s2);
		
		s = "김길동";
		System.out.println(s.equals(s2));
		System.out.println(s == s2);
		
		// String을 사용하는 것은 좋으나, 값이 자주 변경되는 경우에는 비효율적
		StringBuilder builder = new StringBuilder();
		builder.append("송길동");
		System.out.println(builder);
	}

}
