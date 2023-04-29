package 문자열;

public class 함수만들기연습2 {
	
	public static void 오전() {
		System.out.println("1. 세수하기");
		System.out.println("2. 아침먹기");
		System.out.println("3. 운동장에서 운동하기");
	}
	
	public static void 오후() {
		System.out.println("4. 낮잠자기");
		System.out.println("5. 점심먹기");
		System.out.println("6. 외출준비(화장하기)");
		System.out.println("7. 외출");
	}
	
	public static void 저녁() {
		System.out.println("8. 귀가");
		System.out.println("9. 저녁먹기");
		System.out.println("10. 운동하기");
	}
	
	public static void 밤() {
		System.out.println("잠자기");
	}

	public static void main(String[] args) {
		// 내가 일어나서 하는 일
		오전();
		오후();
		저녁();
		밤();
	}

}
