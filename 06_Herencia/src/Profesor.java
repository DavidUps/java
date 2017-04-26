
public class Profesor {

	int sueldo;
	int anhosExperiencia;
	boolean esFijo;
	
	public Profesor(int sueldo, int anhosExperiencia, boolean esFijo) {
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
		return "Profesor [sueldo=" + sueldo + ", anhosExperiencia=" + anhosExperiencia + ", esFijo=" + esFijo + "]";
	}
	
	
}
