package otraspruebas;

import pe.edu.ao.app.prueba.Cuadrado;

public class StaticDemo {
	static int x;
	final static int y;
	int sum() {
		return x+y;
	}
	static{
		y=100;
	}
}
