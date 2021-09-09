package otraspruebas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class MainDemo {

	public static void f() {
		int vap=10;
		
		if (vap == 10 ) {
			throw new MiError();
		}
	}
	public static void main(String[] args){
		// TODO Auto-generated method stub
//		StaticDemo o1 = new StaticDemo();
//		o1.x= 10;
//		
//		System.out.println(o1.sum());
//		
//		StaticDemo o2 = new StaticDemo();
//		
//		System.out.println(o2.sum());
//		
//		Clase2 o3 = new Clase2();
//		o3.f();
		//f();
		//f();
		
		int p = 10;
		System.out.println("El valor es: " + p);
		
		MiInterfaz miInterfaz = (val,val2)->(val+val2);
		System.out.println(miInterfaz.f(100, 3223));

		MiInterfaz miInterfaz2 = (val,val2)->{
			int x = 10000*val;
			int y = val2;
			return x+y;
		};
		System.out.println(miInterfaz2.f(100, 3223));
		miInterfaz.g();
		miInterfaz.f(100);
		
		
		ArrayList<Integer> v = new ArrayList<>();
		v.add(10);
		v.add(3);
		v.add(199);
		
		//v.stream().filter(x-> x < 100).forEach(System.out::println);
		v.stream().sorted((x,y)-> y.compareTo(x)).forEach(System.out::println);
		
		LinkedHashSet<Integer> h = new LinkedHashSet<>();
		h.add(200);
		h.add(1);
		h.add(12);
		h.add(10000);
		
		List<Integer> v2= h.stream().map((x)->x*2).toList();
		
		System.out.println(v2.get(0));
		
		System.out.println("::::::");
		for ( Integer val : v2) {
			System.out.println(val);
		}
		
		TreeSet<Object> v3=new TreeSet<>();
		v3.add("String");
		v3.add("hola");
		v3.add("4554");
		System.out.println(v3);
		
		ArrayList<Integer> array = new ArrayList<>();
		array.add(323);
		array.add(434);
		array.add(1);
		
		
		array.sort((x,y)->{
			if ( x < y )return -132;
			return 1;
		});
		
		Integer num2= 10;
		System.out.println(num2.compareTo(122));
		System.out.println(array);
		
		ArrayList<Clase1> array2=new ArrayList<>();
		
		array2.add(new Clase1(1000000,"Steve"));
		array2.add(new Clase1(1000,"Mark"));
		array2.add(new Clase1(1000,"Andres"));
//		array2.sort((x,y)->{
//			String cad = x.nombre;
//			String cad2 = y.nombre;
//			if (cad.compareTo(cad2)<0 ) {
//				return -1;
//			}
//			return 1;
//		});
		String cad1="Andres";
		String cad2="Mark";
//		Integer n1=102;
//		Integer n4= 1000;
//		Integer n2=100+2;
		Clase1 c1= new Clase1(100,"jjaja");
//		Clase1 cc= new Clase1(1003,"jjaja");
		Clase1 c2 = new Clase1(100,"holas");
		
		if (c1.num1==c2.num1) {
			System.out.println("si esta aqui");
		}
		System.out.println("es:"+cad1.compareTo(cad2));
		array2.sort((x,y)->{
			if (x.num1<y.num1)return -13;
			else if ( x.num1==y.num1) {
				if (x.nombre.compareTo(y.nombre)<0) return -32;
				else return 2;
			}else {
				return 1;
			}
		});
		
		System.out.println(array2);
		System.out.println("111111");
		HashMap<Clase1,Integer> x = new HashMap<>();
		
		
		Clase1 p1 = new Clase1(100,"hola");
		Clase1 p2 = new Clase1(200,"peru");
		Clase1 p3 = new Clase1(100,"hola");
		
		
		x.put(p1,23);
		x.put(p2,4);
		
		Integer val = 2000000000+1000000000;
		System.out.println(x.get(p1));
		System.out.println(x.get(p3));
		System.out.println(val.hashCode());
		String h1="hola";
		String h2="hola";
		if (h1==h2) {
			System.out.println("fdf");
		}
		
	}

}
