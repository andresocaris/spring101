package otraspruebas;

import java.util.Objects;

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
	public int hashCode() {
		return Objects.hash(nombre, num1);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Clase1 other = (Clase1) obj;
		return Objects.equals(nombre, other.nombre) && Objects.equals(num1, other.num1);
	}
	
}
