class Solution55 {
	public long solution(int n) {
		long answer = 0;
		long[] arr = new long[n+1];
        
    for (int i = 1; i <= n; i++) {
			if (i == 1 || i ==2 ) {
				arr[i] = i;
			} else {
				arr[i] = (arr[i-2] + arr[i-1]) % 1234567;
			}
		}
    answer = arr[n];
    return answer;
  }
}
