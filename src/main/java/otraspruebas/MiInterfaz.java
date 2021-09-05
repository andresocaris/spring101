package otraspruebas;

public interface MiInterfaz {
	int f(int num1,int num2);
	default public void g() {
		System.out.println("esto es mi metodo por defecto");
	}
	default public void f(int x) {
		System.out.println("hola"+x);
	}
}
