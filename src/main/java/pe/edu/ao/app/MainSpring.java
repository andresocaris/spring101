package pe.edu.ao.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import pe.edu.ao.app.vehiculo.Carro;

@Configuration
@ComponentScan
public class MainSpring {
	public static void main(String[] args ) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(MainSpring.class);
		
		Carro carro= ctx.getBean(Carro.class);
		
		carro.avanzar();
		carro.detener();
		
	}
}
