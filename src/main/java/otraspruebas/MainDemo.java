package otraspruebas;

public class MainDemo {

	public static void main(String[] args) throws MiError {
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
//		int val=10;
//		
//		if (val == 10 ) {
//			throw new MiError();
//		}
//		
//		int p = 10;
//		System.out.println("El valor es: " + p);
		
		MiInterfaz miInterfaz = (val,val2)->(val+val2);
		System.out.println(miInterfaz.f(100, 3223));

		MiInterfaz miInterfaz2 = (val,val2)->{
			int x = 10000*val;
			int y = val2;
			return x+y;
		};
		System.out.println(miInterfaz2.f(100, 3223));
	}

}
