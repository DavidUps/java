
public class Profesor extends Persona{

	int sueldo;
	int anhosExperiencia;
	boolean esFijo;
	

	
	public Profesor(String dni, String nombre, String apellido1, String apellido2, int sueldo, int anhosExperiencia,
			boolean esFijo) {
		super(dni, nombre, apellido1, apellido2);
		this.sueldo = sueldo;
		this.anhosExperiencia = anhosExperiencia;
		this.esFijo = esFijo;
	}
	
	protected int getSueldo() {
		return sueldo;
	}
	protected void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	protected int getAnhosExperiencia() {
		return anhosExperiencia;
	}
	protected void setAnhosExperiencia(int anhosExperiencia) {
		this.anhosExperiencia = anhosExperiencia;
	}
	protected boolean isEsFijo() {
		return esFijo;
	}
	protected void setEsFijo(boolean esFijo) {
		this.esFijo = esFijo;
	}

	@Override
	public String toString() {
		return "Profesor [dni=" + dni + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2
				+ ", sueldo=" + sueldo + ", anhosExperiencia=" + anhosExperiencia + ", esFijo=" + esFijo + "]";
	}
	
	
	
	
}
