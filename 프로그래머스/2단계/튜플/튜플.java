package 프로그래머스;

import java.util.ArrayList;
import java.util.Arrays;

public class 튜플 {

	public static void main(String[] args) {
		String s = "{{4,2,3},{3},{2,3,4,1},{2,3}}";
		Solution44 sol = new Solution44();
		int[] result = sol.solution(s);
		System.err.println(Arrays.toString(result));
	}

}

class Solution44 {
	public int[] solution(String s) {
		int[] answer = {};
        
    String s2 = s.substring(2, s.length()-2);
    String[] arr = s2.split("\\}\\,\\{");
        
    ArrayList<ArrayList<Integer>> listArr = new ArrayList<>();
        
    for (int i = 0; i < arr.length; i++) {
			String[] nArr = arr[i].split(",");
			ArrayList<Integer> intArr = new ArrayList<>();
			for (String n : nArr) {
				intArr.add(Integer.parseInt(n));
			}
			listArr.add(intArr);
		}
        
    for (int i = 0; i < listArr.size(); i++) {
			for (int j = i + 1; j < listArr.size(); j++) {
				ArrayList<Integer> arr1 = listArr.get(i);
				ArrayList<Integer> arr2 = listArr.get(j);
				if (arr1.size() > arr2.size()) {
					listArr.set(i, arr2);
					listArr.set(j, arr1);
				}
			}
		}
        
    ArrayList<Integer> lastArr = new ArrayList<>();
    for (int i = 0; i < listArr.size(); i++) {
	    ArrayList<Integer> arr3 = listArr.get(i);
	    for (int j = 0; j < arr3.size(); j++) {
			  if (!lastArr.contains(arr3.get(j))) {
	        lastArr.add(arr3.get(j));
				}
			}
		}
        
    answer = new int[lastArr.size()];
    for (int i = 0; i < lastArr.size(); i++) {
			answer[i] = lastArr.get(i);
		}
        
    return answer;
  }
}
