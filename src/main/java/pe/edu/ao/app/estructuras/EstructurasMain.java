package pe.edu.ao.app.estructuras;



public class EstructurasMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap2<String,String> M = new HashMap2<String,String>();
		M.put2("hola", "andres");
		M.put2("peru", "***");
		System.out.println(M.get2("hola"));
		System.out.println(M.get2("peru"));
	}

}
