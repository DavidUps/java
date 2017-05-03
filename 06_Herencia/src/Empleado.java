
public class Empleado extends Persona {

	int sueldo;
	char categoria; //'l'-> limpieza | 'a' -> administracion | 'd' -> directivo
	
	

	public Empleado(String dni, String nombre, String apellido1, String apellido2, int sueldo, char categoria) {
		super(dni, nombre, apellido1, apellido2);
		this.sueldo = sueldo;
		this.categoria = categoria;
	}

	protected int getSueldo() {
		return sueldo;
	}

	protected void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	protected char getCategoria() {
		return categoria;
	}

	protected void setCategoria(char categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Empleado [dni=" + dni + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2
				+ ", sueldo=" + sueldo + ", categoria=" + categoria + "]";
	}

	
	
	
	
	
}
