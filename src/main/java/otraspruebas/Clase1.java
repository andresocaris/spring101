package otraspruebas;

public class Clase1 {
	Integer num1;
	String nombre;
	Clase1(Integer num1,String nombre){
		this.num1=num1;
		this.nombre=nombre;
	}
	void f() {
		System.out.println(" es una Clase1");
	}
	@Override
	public String toString() {
		return "Clase1 [num1=" + num1 + ", nombre=" + nombre + "]";
	}
	
}
