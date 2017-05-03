
public class Alumno extends Persona {

	int curso;
	int anhoNac;
	char sexo; //'h'-> hombre | 'm' -> mujer
	
	

	public Alumno(String dni, String nombre, String apellido1, String apellido2, int curso, int anhoNac, char sexo) {
		super(dni, nombre, apellido1, apellido2);
		this.curso = curso;
		this.anhoNac = anhoNac;
		this.sexo = sexo;
	}

	protected int getCurso() {
		return curso;
	}

	protected void setCurso(int curso) {
		this.curso = curso;
	}

	protected int getAnhoNac() {
		return anhoNac;
	}

	protected void setAnhoNac(int anhoNac) {
		this.anhoNac = anhoNac;
	}

	protected char getSexo() {
		return sexo;
	}

	protected void setSexo(char sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2
				+ ", curso=" + curso + ", anhoNac=" + anhoNac + ", sexo=" + sexo + "]";
	}

	
	
	
}
