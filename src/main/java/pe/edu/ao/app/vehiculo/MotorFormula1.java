package pe.edu.ao.app.vehiculo;

import org.springframework.stereotype.Component;

@Component
public class MotorFormula1 implements Motor {

	@Override
	public void calibrar() {
		
		System.out.println("calibrar");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void desacelerar() {

		System.out.println("desacelerar");
		// TODO Auto-generated method stub
		
	}
				
}
