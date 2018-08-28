package pcastro.Funcionario;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith (JUnitParamsRunner.class)
class FuncionarioTest {

	@Test
	@Parameters ({"1999.00, 0 , false, 1909.05",
				  "5000.00, 0 , false, 4172.00"		
				})
	public void SalarioLiquidoTest(double salbase,int ndep,boolean ins,double rEsp) {
		Funcionario f1 = new Funcionario(10, "Pedro", 5000.0, 2, true);
		double observed = f1.getSalarioLiquido();
		assertEquals(observed, rEsp,  0.01);
	}
}
