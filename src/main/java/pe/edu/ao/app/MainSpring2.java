package pe.edu.ao.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.edu.ao.app.persona.Persona;

public class MainSpring2 {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
		Persona m = (Persona)appContext.getBean(Persona.class);
		System.out.println(m.saludo());
		
		((ClassPathXmlApplicationContext)appContext).close();
	}
}
