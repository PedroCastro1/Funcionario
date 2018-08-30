package pcastro.Funcionario;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class FuncionarioTest {

	@Test
	@Parameters({"1000.0,0,false,955.0", "2000.0, 0, false, 1910.0",
		 		 "2001.00,0,false,1670.835", "5000.00,0,false,4175.00",
		 		 "5001.00,0,false,3400.725", "1000.00,1,true,1065",
		 		 "2001.00,2,true,1910.95", "5000.00,3,true,4825.00",
		 		 "5001.00,1,true,3950.83"
		   		})
	
	public void testaFuncionario(double salBase, int nroDep, boolean ins, double rEsp) {
		Funcionario f1 = new Funcionario(1,"Pedro", salBase, nroDep, ins);
		double observado = f1.getSalarioLiquido();
		assertEquals(observado, rEsp, 0.01);
	}
}
