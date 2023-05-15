package 프로그래머스;

import java.util.HashMap;

public class 전화번호목록 {

	public static void main(String[] args) {
		Solution11 sol = new Solution11();
		String[] phone_book = {"119", "97674223", "11955224421"};
		boolean answer = sol.solution(phone_book);
		System.out.println(answer);
 	}

}

class Solution11 {
    public boolean solution(String[] phone_book) {
   
    	boolean answer = true;
    	
    	HashMap<String, Integer> map = new HashMap<String, Integer>();
    	    	
    	for (int i = 0; i < phone_book.length; i++) {
			map.put(phone_book[i], i);
		}
    	
    	for (String x : phone_book) {
			for (int i = 1; i < x.length(); i++) {
				if (map.containsKey(x.substring(0, i))) {
					answer = false;
				}
			}
		}
    	
        return answer;
    }
}
