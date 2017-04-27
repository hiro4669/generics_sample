import java.util.*;

public class BadExample {
	public static void main(String ...args) {
		List<Number> nlist = new ArrayList<>();
		nlist.add(1);
		nlist.add(2);
		List<Integer> ilist = new ArrayList<>();
		ilist.add(1);
		ilist.add(2);
		//		nlist = ilist; // NG

		List<? extends Number> slist; 
		slist = ilist;   // OK but..
		//slist.add(1);   // NG

		test1(nlist); // OK
		//		test1(ilist); // NG
		test2(nlist);
		test2(ilist);
		
		
	}

	public static void test1(List<Number> nlist) {
	}
	public static void test2(List<? extends Number> list) {
		System.out.println("->: " + list.get(0));
	}
}
