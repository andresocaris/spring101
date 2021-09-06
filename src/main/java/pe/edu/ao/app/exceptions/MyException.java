package pe.edu.ao.app.exceptions;

public class MyException extends Exception{

	private static final long serialVersionUID = 5955817232894050146L;

	public MyException() {
		super("esto es mi exception");
	}
}
