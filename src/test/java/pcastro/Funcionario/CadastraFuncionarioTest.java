package pcastro.Funcionario;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.JUnitParamsRunner;
import java.util.ArrayList;

@RunWith(JUnitParamsRunner.class)
public class CadastraFuncionarioTest {
	private CadastroFuncionarios c = new CadastroFuncionarios();
	
	@Test
	public void testaTamanhoList() {
		c.cadastra();
		ArrayList<Funcionario> lst = c.devolveList();
		assertThat(lst, hasSize(greaterThan(0)));
	}
}
