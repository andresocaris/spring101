package pe.edu.ao.app;

import pe.edu.ao.app.vehiculo.Carro;
import pe.edu.ao.app.vehiculo.CarroFormula1;
import pe.edu.ao.app.vehiculo.Motor;
import pe.edu.ao.app.vehiculo.MotorFormula1;

public class Main {

	public static void main(String[] args) {
		//inyeccion de dependencia con inversion de control
		
		Motor motor = new MotorFormula1();
		
		Carro carro = new CarroFormula1(motor);
		
		// usar las instancias generadas
		carro.avanzar();
		carro.detener();
		
	}
}
