package pe.edu.ao.app.juego;

import java.util.List;


public interface Juego  extends Cloneable{
	
	Juego clonar();
	void imprimirPosiciones(); 
	void obtenerPosicionesSinAtacarse();
	boolean validarFichasEnTablero(List<Ficha> v );
	void setFichas(List<Ficha> fichas);
	void f();
}
