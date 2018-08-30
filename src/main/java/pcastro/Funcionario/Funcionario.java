package pcastro.Funcionario;

public class Funcionario {
	private int matricula = 0;
	private String nome = "";
	private double salarioBase = 0.0;
	private int nroDependentes = 0;
	private boolean insalubridade = false;
	
	public Funcionario(int matricula, String nome, double salarioBase, int nroDependentes, boolean insalubridade) {
		this.matricula = matricula;
		this.nome = nome;
		this.salarioBase = salarioBase;
		this.nroDependentes = nroDependentes;
		this.insalubridade = insalubridade;
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getSalarioBase() {
		return salarioBase;
	}
	
	public int getNroDependentes() {
		return nroDependentes;
	}
	
	public boolean getInsalubridade() {
		return insalubridade;
	}
	
	public double getSalarioBruto() {
		double salarioBruto = getSalarioBase();
		if(getInsalubridade()) {
			salarioBruto = salarioBase * 1.1;
		}
		if(getNroDependentes() > 0) {
			salarioBruto += salarioBase * (getNroDependentes()/100.0);
		}
		return salarioBruto;
	}

	private double getINSS() {
		double INSS = 0.045;
    		double descontoINSS = getSalarioBase() * INSS;
    		if(getSalarioBase() > 5000.0){
      			descontoINSS = 5000.0 * INSS;
    		}
    		return descontoINSS;
  	}

  	private double getImposto() {
    		double impostoDeRenda = 0.0;    
    		if(getSalarioBase() <= 2000.0){
     			impostoDeRenda = 0.0;
    		}
    		if(getSalarioBase() > 2000.0 && getSalarioBase() <= 5000.0){
     			impostoDeRenda = getSalarioBase() * 12/100.0;
    		}
    		else if(getSalarioBase() > 5000.0){
     			impostoDeRenda = getSalarioBase() * 27.5/100.0;
    		}
    		return impostoDeRenda;
 	}
	
	public double getSalarioLiquido() {
		return getSalarioBruto() - (getImposto() + getINSS());
	}
}
