package test_01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MapFor {

	public static void main(String[] args) {
		HashMap<String, String> hashMap = new HashMap<>();
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("1");
		arrayList.add("2");
		arrayList.add("3");
		hashMap.put("1", "С��");
		hashMap.put("2", "С��");
		hashMap.put("3", "С��");
		hashMap.put("4", "С��");
		System.out.println(arrayList);
		Iterator<String> iterator2 = arrayList.iterator();
		while (iterator2.hasNext()) {
			String next = iterator2.next();
			if (next.equals("1")) {
				iterator2.remove();
			}
			
		}
		System.out.println(arrayList);
		
		System.out.println(hashMap.keySet());
		Iterator<String> iterator = hashMap.keySet().iterator();
		while (iterator.hasNext()) {
			String next = iterator.next();
			if (next.equals("1")) {
				iterator.remove();
			}
			
		}
		System.out.println(hashMap.keySet());
	/*	
		Set<String> keySet = hashMap.keySet();
		
		for (String string : keySet) {
			if (string.equals("2")) {
				hashMap.remove(string);
			}
		}
		System.out.println(hashMap);*/
		//System.out.println(hashMap.keySet());
	}
	
	/*List <?super Number> foo = new ArrayList<Integer>();
	List <?extends Number> foo1 = new ArrayList<Double>();
	List <?extends Integer> foo2 = new ArrayList<Integer>();
	List <?super Integer> foo3 = new ArrayList<Number>();*/
	
	
}
