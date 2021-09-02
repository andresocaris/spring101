package pe.edu.ao.app.prueba;

import java.util.List;

public abstract class FiguraAbstract implements Figura{
	int numeroLados;
	String nombre="";
	public FiguraAbstract( int numeroLados){
		this.numeroLados = numeroLados;
	}
	public double area() {
		String nombre = getNombre();
		if (nombre == "triangulo" ) {
			System.out.println("");
			int perimetro = getPerimetro();
			double areaFigura = perimetro/2.0;
			List<Integer> ladosFigura = getLados();
			for ( Integer lado : ladosFigura ) {
				areaFigura *= (perimetro/2.0-lado);
			}
			return Math.sqrt(areaFigura);
	    }
		if (nombre =="cuadrado") {
			List<Integer> ladosFigura = getLados();
			return ladosFigura.get(0)*ladosFigura.get(0);
		}
		return getArea();
	}
	public abstract void getInfo();
	public abstract int getPerimetro();
	public abstract List<Integer> getLados();
	public abstract  double getArea();
	public abstract String getNombre();
}

