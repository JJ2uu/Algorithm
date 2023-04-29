package 문자열;

public class 문자열포함인덱스테스트 {

	public static void main(String[] args) {
		String s = "aaabbccadda";

		System.out.println(s.contains("a"));
		System.out.println(s.contains("aaa"));
		System.out.println(s.contains("bc"));
		System.out.println(s.indexOf("a"));
		System.out.println(s.lastIndexOf("a"));
		System.out.println(s.lastIndexOf("a", 3));
		System.out.println(s.lastIndexOf("a", 8));
		System.out.println(s.indexOf("f")); // 없다면 -1값이 나온다
	}

}
