package pcastro.Funcionario;

import java.util.ArrayList;
public class CadastroFuncionarios {
	private ArrayList<Funcionario> lst = new ArrayList<Funcionario>();

	public void cadastra() {
		boolean flag = false;
		for(int i = 1; i < 51; i++) {
			if(i % 2 == 0) {
				flag = true;
			}else {
				flag = false;
			}
			Funcionario f = new Funcionario(i, i + "", (Math.random() * 300) * i, (int) (Math.random() * 5) , flag);
			lst.add(f);
		}
	}
	
	public ArrayList<Funcionario> getLista() {
		return lst;
	}
}
