package pe.edu.ao.app.juego;

public class Caballo  implements Ficha{
	public int x, y;
	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPosicion(int _x, int _y) {
		// TODO Auto-generated method stub
		x = _x;
		y=_y;
	}

	@Override
	public void getPosicion() {
		System.out.println("caballo : ( "+ x + "," + y + ")");
		// TODO Auto-generated method stub	
	}

	@Override
	public int getX() {
		return x;
	}

	@Override
	public int getY() {
		return y;
	}

	@Override
	public boolean validar_direccion(int x, int y) {
		if ( Math.abs(x)==1 && Math.abs(y) == 2 )return true;
		if ( Math.abs(x)==2 && Math.abs(y) == 1 )return true;
		return false;
	}

	@Override
	public String toString() {
		return "Caballo [x=" + x + ", y=" + y + "]";
	}

}
