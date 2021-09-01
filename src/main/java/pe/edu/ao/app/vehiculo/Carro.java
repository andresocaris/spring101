package pe.edu.ao.app.vehiculo;

import pe.edu.ao.app.exceptions.ChoqueException;

public interface Carro {
	void avanzar();
	void detener() throws ChoqueException;
}

