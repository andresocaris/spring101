package pe.edu.ao.app;

import java.util.ArrayList;
import java.util.List;

//import org.hibernate.Session;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import pe.edu.ao.app.juego.Caballo;
import pe.edu.ao.app.juego.Ficha;
//import pe.edu.ao.app.juego.HibernateUtil;
import pe.edu.ao.app.juego.Juego;

import pe.edu.ao.app.juego.Reina;

@Configuration
@ComponentScan
public class MainJuego {
	public static void main(String[] args) {
		// inyeccion de dependencia con inversion de control
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(MainJuego.class);
		// mutable 
		Juego juegoAjedrez = ctx.getBean(Juego.class);
		List<Ficha> fichas = new ArrayList<>();
		int cantidadFichasIngresadas = 7;
		
		//metiendo elementos
		for (int i = 0; i < cantidadFichasIngresadas; i++) {
			Ficha reina = new Reina();
			fichas.add(reina);
		}
		
		juegoAjedrez.setFichas(fichas);
		
		juegoAjedrez.imprimirPosiciones();
		
		fichas.add(new Caballo());
		
		System.out.println("*******");
		
		juegoAjedrez.imprimirPosiciones();
		juegoAjedrez.obtenerPosicionesSinAtacarse();
		
		//JuegoAjedrez juegoAjedrez2 = (JuegoAjedrez)juegoAjedrez.clonar();
		//System.out.println(juegoAjedrez);
		//System.out.println(juegoAjedrez2);
		
		
		((AnnotationConfigApplicationContext)ctx).close();
	}
	public static void f() {
//		Session session = HibernateUtil.getSessionFactory().openSession();
//		Transaction transaction=null; 
//		transaction = session.beginTransaction();
//        List<Student> x = session.createQuery("select p from Student p").list(); 
//		System.out.println(x.get(0));
		
	}
}
