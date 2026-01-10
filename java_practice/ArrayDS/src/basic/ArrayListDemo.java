package basic;

import java.util.HashSet;
import java.util.Set;

public class ArrayListDemo {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		
		set.add(10);
		set.add(20);
		set.add(50);
		set.add(20); // duplicate
		System.out.println(set.contains(30));
	}

}
