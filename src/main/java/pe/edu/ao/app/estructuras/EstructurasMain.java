package pe.edu.ao.app.estructuras;



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
	}

}
