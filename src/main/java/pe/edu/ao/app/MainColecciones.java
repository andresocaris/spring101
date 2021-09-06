package pe.edu.ao.app;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;

import pe.edu.ao.app.exceptions.MyException;

public class MainColecciones {
	public static void main(String[] args) throws MyException {
		long start = System.currentTimeMillis();
		// Array
		int[] x;
		x = new int[3];
		x[0] = 3;
		x[1] = 5;
		x[2] = 5;
		for (int a : x) {
			System.out.println("numero:" + a);
		}
		// Array List
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(56);
		arrayList.add(4);
		arrayList.add(5);
		arrayList.add(5);
		arrayList.add(66);
		arrayList.remove(1);
		System.out.println(arrayList);
		arrayList.add(100000);
		arrayList.add(100);
		arrayList.add(545);
		arrayList.sort((Integer a, Integer b) -> {
			return a > b ? 1 : -1;
		});
		System.out.println(arrayList);

		// in
		// String inmutable
		String s="a";
		for (int i=0;i<10;i++) {
			s = s + 'a';
		}
		// System.out.println(s);

		System.out.println();
		if (arrayList.contains(545)) {
			System.out.println("si esta");
		}
		Integer pos = arrayList.indexOf(545);
		System.out.println(pos);

//		ArrayList<Integer> arrayList2 = (ArrayList) arrayList.clone();
//		Object[] object = arrayList2.toArray();
//		System.out.println("array object");
//		System.out.println(object);

		//LinkedList
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.addFirst(43);
		linkedList.addFirst(54);
		linkedList.addLast(455);
		linkedList.addFirst(11111);

		System.out.println(linkedList);
		
		//HashSet
		HashSet<String> hashSet = new HashSet<String>();
		
		hashSet.add("aola");
		hashSet.add("hola");
		hashSet.add("andres");
		hashSet.add(null);
		hashSet.remove("andres");
	
		
		System.out.println(hashSet);
		
		//LinkedHashSet
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
		
		linkedHashSet.add("peru");
		linkedHashSet.add("andres");
		linkedHashSet.add(null);
		linkedHashSet.add(null);
		linkedHashSet.remove("andres");
		linkedHashSet.add("andres");
		System.out.println(linkedHashSet);

		
		//HashMap
		HashMap<String,Integer> hashMap = new HashMap<String,Integer>();
		hashMap.put("hola",232);
		hashMap.put("aaa", 1);
		System.out.println(hashMap);
		
		//LinkedHashMap
		LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap<String,Integer>();
		linkedHashMap.put("hola",3);
		linkedHashMap.put("andres",4);
		linkedHashMap.put("and",5);
		
		linkedHashMap.put(null, 4);

		linkedHashMap.put(null, 5);
		System.out.println(linkedHashMap);
		
		try {
			//Integer num = 100/0;
		}catch(RuntimeException e ) {
			e.printStackTrace();
		}
		System.out.println("paso por aqui");
		System.err.println("esto es un error");
		Integer num2=100;
		if ( num2 == 10 ) {
			throw new MyException(" es mi exception");
		}
		
		System.out.println("here");
		long end = System.currentTimeMillis();
		NumberFormat formatter = new DecimalFormat("#0.00000");
		System.out.print("Execution time is " + formatter.format((end - start) / 1000d) + " seconds");
	}
}
