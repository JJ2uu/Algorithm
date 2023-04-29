package 문자열;

public class 문자열처리방법 {

	public static void main(String[] args) {
		String s = "I am a programer!";
		String s2 = "real!";
		
		System.out.println(s + s2); // 스트링 결합
		System.out.println(s.concat(s2)); // 스트링 결합
		System.out.println(s.charAt(0)); // 한 글자 추출
		System.out.println(s.endsWith("!")); // !로 끝나는지 확인
		System.out.println(s.substring(3)); // 3번째 글자 이후로 다 추출
		System.out.println(s.substring(3, 8)); // 3~8번쨰 글자 추출
		System.out.println(s.contains(s2)); // s2가 s에 포함되어있나
		System.out.println(s.lastIndexOf("p")); // p의 index
		System.out.println(s.toUpperCase()); // 대문자로
		System.out.println(s.toLowerCase()); // 소문자로
		System.out.println(s.length()); // 글자수
		System.out.println(s.replace("I am", "I'm")); // 바꾸기

	}
	
	

}
