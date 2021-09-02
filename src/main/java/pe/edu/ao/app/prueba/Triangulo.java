package pe.edu.ao.app.prueba;

import java.util.ArrayList;
import java.util.List;

public class Triangulo extends FiguraAbstract {
	int lado1,lado2,lado3;
	public Triangulo( int lado1 , int lado2 ,int lado3 ) {
		super(3);
		this.lado1=lado1;
		this.lado2=lado2;
		this.lado3=lado3;
	}
	@Override
	public void getInfo() {
		System.out.println("---------------INFO------------------------");
		System.out.println("Numero de Lados: "+numeroLados);
		System.out.format("Es un Triangulo con lados : %d,%d,%d\n",lado1,lado2,lado3);
		System.out.println("El Area es: "+area());
		System.out.println("-------------------------------------------");
	}
	@Override
	public int getPerimetro() {
		return lado1+lado2+lado3;
	}
	@Override
	public List<Integer> getLados() {
		List<Integer> lados = new ArrayList();
		lados.add(lado1);
		lados.add(lado2);
		lados.add(lado3);
		return lados;
	}
	@Override
	public double getArea() {
		return area();
	}
	@Override
	public String getNombre() {
		return "triangulo";
	}
}
