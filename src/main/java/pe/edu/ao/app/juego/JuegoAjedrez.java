package pe.edu.ao.app.juego;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class JuegoAjedrez implements Juego{
	private List<Ficha>  fichas;
	private List<Ficha> fichasIngresadasAlTablero=new ArrayList<>();
	private int posicionUltimaFichaIngresada=0;
	private int solucionEncontrada = 0;
	
	public void setFichas(List<Ficha> fichas) {
		this.fichas = fichas;
	}
	@Override
	public boolean validarFichasEnTablero(List<Ficha> fichas ) {
		int cantidadFichas = (int)fichas.size();	
		for (int i=0;i<cantidadFichas;i++) {
			for (int j=0;j<cantidadFichas;j++) {
				if ( i == j )continue;
				int direccionX= fichas.get(j).getX()-fichas.get(i).getX();
				int direccionY= fichas.get(j).getY()-fichas.get(i).getY();
				if ( fichas.get(i).validar_direccion(direccionX, direccionY) == true) return false;
				if ( fichas.get(j).validar_direccion(direccionX, direccionY) == true) return false;
			}
		}
		return true;
	}
	@Override
	public void obtenerPosicionesSinAtacarse() {
		if ( solucionEncontrada == 1 )return;
		int cantidadFichas= (int)this.fichas.size();
		if (posicionUltimaFichaIngresada==cantidadFichas && solucionEncontrada == 0) {
			if (validarFichasEnTablero(this.fichasIngresadasAlTablero)) {
				System.out.println("posiciones sin atacarse");
				for (int i=0;i<(int)fichasIngresadasAlTablero.size();i++) {
					this.fichasIngresadasAlTablero.get(i).getPosicion();
				}	
				solucionEncontrada=1;
			}
			return;
		}
		for (int i=0;i<cantidadFichas;i++) {
			Ficha ficha = fichas.get(posicionUltimaFichaIngresada);
			ficha.setPosicion(i, posicionUltimaFichaIngresada);
			this.fichasIngresadasAlTablero.add(ficha);
			posicionUltimaFichaIngresada++;
			obtenerPosicionesSinAtacarse();
			posicionUltimaFichaIngresada--;
			this.fichasIngresadasAlTablero.remove(posicionUltimaFichaIngresada);
		}
	}
	@Override
	public void imprimirPosiciones() {
		for ( Ficha  ficha : fichas) {
			ficha.getPosicion();
		}
	}
	public void f() {
	}
	@Override
	public Juego clonar() {
		JuegoAjedrez juegoAjedrez  = null;
		try {
			juegoAjedrez = (JuegoAjedrez)clone();
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return juegoAjedrez;
	}
	@Override
	public String toString() {
		return "JuegoAjedrez [fichas=" + fichas + ", fichasIngresadasAlTablero=" + fichasIngresadasAlTablero
				+ ", posicionUltimaFichaIngresada=" + posicionUltimaFichaIngresada + ", solucionEncontrada="
				+ solucionEncontrada + "]";
	}
	
}
