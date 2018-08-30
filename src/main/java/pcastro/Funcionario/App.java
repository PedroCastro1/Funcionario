package pcastro.Funcionario;
import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		CadastroFuncionarios c = new CadastroFuncionarios();
		ArrayList<Funcionario> lst = new ArrayList<Funcionario>();
		c.cadastra();
		lst = c.devolveList();
		
		for(Funcionario f: lst) {
			System.out.println(f.toString());
		}
	}		
}
