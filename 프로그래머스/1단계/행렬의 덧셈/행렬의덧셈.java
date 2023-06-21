package 프로그래머스;

public class 행렬의덧셈 {

	public static void main(String[] args) {
		int[][] arr1 = {{1}, {2}};
		int[][] arr2 = {{3}, {4}};

		// arr1의 행의 개수   arr1[0] 열의 개수
		int[][] answer = new int[arr1.length][arr1[0].length];

		
		for (int i = 0; i < arr1.length; i++) { // 행마다
			for (int j = 0; j < arr1[i].length; j++) { //열마다
				answer[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		
		answer = arr1.clone();
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				answer[i][j] += arr2[i][j]; // answer에 더함
			}
		}

	}

}
