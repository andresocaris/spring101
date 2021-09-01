package pe.edu.ao.app.juego;

public interface Ficha {
	public void move();
	public void setPosicion(int x,int y);
	public void getPosicion();
	public int getX();
	public int getY();
	boolean validar_direccion(int x,int y);	
}
