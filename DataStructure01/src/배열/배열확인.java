package 배열;

public class 배열확인 {

	public static void main(String[] args) {
		// 1. 배열을 만드는 법
		//	1-1. 배열을 만들 때부터 값을 아는경우
		int[] ages = {60, 50, 30, 20, 10};
		
		//	1-2. 만들 때는 값을 모르다가 나중에 넣는 경우
		double[] weight = new double[5];
		weight[0] = 77.8;
		weight[1] = 45.5;
		weight[2] = 88.5;
		weight[3] = 99.5;
		weight[4] = 35.5;
		
		// for문의 2가지
		// c타입 for문
		for (int i = 0; i < ages.length; i++) {
			System.out.println(ages[i] + " " + weight[i]);
		}
		// for-each문
		// 2가지 배열을 출력할 수는 없음
		for (double d : weight) {
			System.out.println(d);
		}
 	}
}
