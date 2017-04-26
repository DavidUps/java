
public class Alumno {

	int curso;
	int anhoNac;
	char sexo; //'h'-> hombre | 'm' -> mujer
	
	public Alumno(int curso, int anhoNac, char sexo) {
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
		return "Alumno [curso=" + curso + ", anhoNac=" + anhoNac + ", sexo=" + sexo + "]";
	}
	
	
}