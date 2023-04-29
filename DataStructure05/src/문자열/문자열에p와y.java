package 문자열;

public class 문자열에p와y {

	public static void main(String[] args) {
		String s = "PpoooyY";
		boolean answer = true;
        String s2 = s.toLowerCase();
        String[] str = s2.split("");
        
        int count1 = 0;
        int count2 = 0;
        
        for(int i=0; i<str.length; i++) {
            if(str[i].equals("p")) {
                count1++;
            } else if (str[i].equals("y")) {
                count2++;
            }
        }
        
        if (count1 == count2) {
            answer = true;
        } else {
            answer = false;
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(count1 + ", " + count2);
	}

}
