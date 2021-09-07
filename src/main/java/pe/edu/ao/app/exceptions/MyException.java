package pe.edu.ao.app.exceptions;

public class MyException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public MyException(String msg) {
		super(msg);
	}
	public MyException(Throwable cause) {
      // call appropriate parent constructor
      super(cause);
	}
}
