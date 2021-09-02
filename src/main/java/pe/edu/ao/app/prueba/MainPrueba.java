package pe.edu.ao.app.prueba;

public class MainPrueba {
	public static void main(String[] args) {
		Triangulo triangulo = new Triangulo(6,8,10);
		triangulo.getInfo();
		System.out.println(triangulo.area());
		
		Cuadrado cuadrado = new Cuadrado(4);
		cuadrado.getInfo();
		System.out.println(cuadrado.area());
		
	}
}
