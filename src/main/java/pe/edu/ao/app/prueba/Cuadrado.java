package pe.edu.ao.app.prueba;

import java.util.ArrayList;
import java.util.List;

public class Cuadrado extends FiguraAbstract{
	int lado;
	public Cuadrado(int lado){
		super(4);
		this.lado = lado;
	}
	@Override
	public void getInfo() {
		System.out.println("---------------INFO------------------------");
		System.out.println("Numero de Lados: "+numeroLados);
		System.out.format("Es un Cuadrado con lado :%d\n",lado);
		System.out.println("El Area es: "+area());
		System.out.println("-------------------------------------------");
	}
	@Override
	public int getPerimetro() {
		return lado*4;
	}
	@Override
	public List<Integer> getLados() {
		List<Integer> lados = new ArrayList();
		for (int i=0;i<4;i++)lados.add(lado);
		return  lados;
	}
	@Override
	public double getArea() {
		return area();
	}
	@Override
	public String getNombre() {
		return "cuadrado";
	}
}
