package EmpregoFaculdade;

public class empregofaculdade {
	private String nome;
	private double salario;
	private int horasAula = 0;
	
	
	double getGastos() {
		return this.salario;
	}
	
	// public void setGastos(int horasAula) {
	// 	this.horasAula = horasAula * 40; }
	
	public void setInfo (double salario) {
		this.salario = salario + horasAula;		
	}
	String getInfo() {
		return "nome: " + this.nome + " com salário " + this.salario;
	}

}
