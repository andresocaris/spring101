package pe.edu.ao.app.inmutable;

public class MainInmutable {

	public static void main(String[] args) {

		Age age=new Age();
		age.setDay(23);
		age.setMonth(10);
		age.setYear(2000);
		Student student=new Student(1,"Andres",age);
		System.out.println("Andres before modification = " + student.getAge().getYear());
		age.setDay(1995);
		student.getAge().setYear(1000);
		System.out.println("Andres after modification = " + student.getAge().getYear());
	}

}
