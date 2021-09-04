package pe.edu.ao.app.estructuras;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class EstructurasMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Andres<String,String> M = new Andres<String,String>();
		M.put2("hola", "andres");
		M.put2("peru", "***");
		M.put2("carpeta","reloj");
		System.out.println(M.get2("hola"));
		System.out.println(M.get2("peru"));
		
		System.out.println(M.size2);
		
		System.out.println(M);
		
		HashMap<String,String> M2 = new HashMap<String,String>();
		
		M2.put("ppp","aaa");
		M2.put("bbb", "ccc");
		M2.put("cccc", "dddd");
		System.out.println(M2);
		ArrayList<Integer> arrayList = new ArrayList();
		
		arrayList.add(3);
		System.out.println(arrayList.hashCode());
		
		// sale de un HashMap
		HashSet<Integer> hashSet = new HashSet();
		LinkedHashMap<String,String> linked=new LinkedHashMap<String,String>();
		
		
		
		
		
	}

}
