
public class Main {

	public static void main(String[] args){
		Alumno a1 = new Alumno("021515115Y", "Armando", "Calderon", "Freire", 1, 1994, 'h');
		Alumno a2 = new Alumno("151212121D", "Gloria", "Ramos", "Lopez", 1, 1996, 'm');
		
		Profesor p1 = new Profesor("012151521Y","Carlos", "Pareja", "Lopez",755, 12, true);
		Profesor p2 = new Profesor("212154121D","Txema", "Gonzalez", "Gonzalez", 915, 7, true);
		
		Empleado e1 = new Empleado("121512153D","Manuel","De","Castro", 1587, 'd');
		Empleado e2 = new Empleado("123123122D","Patricia", "Gomez", "Perez",211, 'a');
		
		System.out.println(e1.toString());
		//Cambiar lo que contiene P1 con seter
		p1.setEsFijo(false);
		System.out.println(p1.toString());
		p2.setNombre("Jose Maria");
		System.out.println(p2.toString());
	}
}
