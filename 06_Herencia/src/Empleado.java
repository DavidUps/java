
public class Empleado {

	int sueldo;
	char categoria; //'l'-> limpieza | 'a' -> administracion | 'd' -> directivo
	
	public Empleado(int sueldo, char categoria) {
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
		return "Empleado [sueldo=" + sueldo + ", categoria=" + categoria + "]";
	}
	
	
	
	
}
