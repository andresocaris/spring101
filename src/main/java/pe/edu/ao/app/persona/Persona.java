package pe.edu.ao.app.persona;

public class Persona {
	String saludo;
	Persona(){}
	
	public String getSaludo() {
		return saludo;
	}

	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}
	public Persona(String saludo){
		this.saludo=saludo;
	}
	public String saludo() {
		return saludo;
	}
}
