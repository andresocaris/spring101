package pe.edu.ao.app.juego;

public class Reina implements Ficha {
	public int x=0,y=0;
	public Reina() {}
	@Override
	public void move() {
		x = x+2;
		y = y+=2;
		System.out.println("x:"+x);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPosicion(int _x, int _y) {
		x = _x;
		y=_y;
		
	}
	@Override
	public void getPosicion() {
		System.out.println("Reina : ( "+ x + "," + y + ")");;

	}
	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return x;
	}
	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return y;
	}
	@Override
	public boolean validar_direccion(int x, int y) {
		// TODO Auto-generated method stub
		if ( x== 0 )return true;
		if ( y==0 ) return true;
		if ( Math.abs(x) ==Math.abs(y) )return true;
		return false;
	}
	@Override
	public String toString() {
		return "Reina [x=" + x + ", y=" + y + "]";
	}
	
	
}
