
public class Moto extends Vehiculo{
	
	int ano;
	boolean proteccion;
	boolean pata;
	int ruedas;
	double deposito;
	char tipo; // 'u' 'c' 't'
	
	public Moto(String matricula, String marca, String modelo, int cilindrada, boolean itv, int ano, boolean proteccion,
			boolean pata, int ruedas, double deposito, char tipo) {
		super(matricula, marca, modelo, cilindrada, itv);
		this.ano = ano;
		this.proteccion = proteccion;
		this.pata = pata;
		this.ruedas = ruedas;
		this.deposito = deposito;
		this.tipo = tipo;
	}

	protected int getAno() {
		return ano;
	}

	protected void setAno(int ano) {
		this.ano = ano;
	}

	protected boolean isProteccion() {
		return proteccion;
	}

	protected void setProteccion(boolean proteccion) {
		this.proteccion = proteccion;
	}

	protected boolean isPata() {
		return pata;
	}

	protected void setPata(boolean pata) {
		this.pata = pata;
	}

	protected int getRuedas() {
		return ruedas;
	}

	protected void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	protected double getDeposito() {
		return deposito;
	}

	protected void setDeposito(double deposito) {
		this.deposito = deposito;
	}

	protected char getTipo() {
		return tipo;
	}

	protected void setTipo(char tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Moto [ano=" + ano + ", proteccion=" + proteccion + ", pata=" + pata + ", ruedas=" + ruedas
				+ ", deposito=" + deposito + ", tipo=" + tipo + "]";
	}
	
	
	
	
}
	