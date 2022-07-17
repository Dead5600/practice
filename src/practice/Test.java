package practice;
import java.util.*;


public class Test {

	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<>();
		a.add(18);
		a.add(21);
		a.add(22);
		a.add(23);
		a.add(12);
		System.out.println(a);
		
		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		System.out.println(a.size());
		System.out.println(a.contains(21));
		a.addAll(a1);
		System.out.println(a);
		System.out.println(a.containsAll(a1));
		System.out.println(a.toArray());
		
		a.retainAll(a1);
		//a.removeAll(a1);
		System.out.println(a);
		
		a.clear();
		System.out.println(a.isEmpty());
	}

}
