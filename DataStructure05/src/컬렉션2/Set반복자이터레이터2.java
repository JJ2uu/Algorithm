package 컬렉션2;

import java.util.HashSet;
import java.util.Iterator;

public class Set반복자이터레이터2 {

	public static void main(String[] args) {
		HashSet<Integer> bag = new HashSet<Integer>();
		bag.add(1000);
		bag.add(2000);
		bag.add(3000);
		bag.add(2000);
		bag.add(4000);
		bag.add(2000);
		bag.add(3000);
		
		Iterator<Integer> it = bag.iterator();
		for (int i = 0; i < bag.size(); i++) {
			System.out.println(it.next());
		}
		
		Object[] list = bag.toArray();
		for (Object x : list) {
			System.out.println(x);
		}

	}

}
