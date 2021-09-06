package pe.edu.ao.app.vehiculo;


import org.springframework.stereotype.Component;

@Component
public class CarroFormula1 implements Carro{
	
	private final Motor motor;
		

	public CarroFormula1(Motor x) {
		this.motor = x;
	}
	
	public void avanzar() {
		motor.calibrar();
	
		return;
	}
	
	public void detener() {
		motor.desacelerar();
		return;
	}
	
}
