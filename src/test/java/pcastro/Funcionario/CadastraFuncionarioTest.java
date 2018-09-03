package pcastro.Funcionario;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.beans.HasPropertyWithValue.hasProperty;

import org.junit.Before;
import org.junit.Test;

public class CadastraFuncionarioTest {
	private CadastroFuncionarios c;
	
	@Before
	public void setup() {
		c = new CadastroFuncionarios();
		c.cadastra();
	}
	
	@Test
	public void testTam() {
		assertThat(c.getLista(), hasSize(50));
	}
	
	@Test
	public void nomesNaoVazio() {
		assertThat(c.getLista(),hasItem(allOf(hasProperty("nome",notNullValue()))));	
	}
	
	@Test
	public void matriculaMaior99(){
		assertThat(c.getLista(),hasItem(allOf(hasProperty("matricula",greaterThan(0)))));
	}
	
	@Test
	public void nroDependentesMaior0(){
		assertThat(c.getLista(),hasItem(allOf(hasProperty("nroDependentes",greaterThan(0)))));
	}
}
