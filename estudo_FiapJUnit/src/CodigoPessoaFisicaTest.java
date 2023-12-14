import org.junit.Assert;
import org.junit.Test;
 
public class CodigoPessoaFisicaTest {
 
	@Test
	public void testeValidaCPF()
	{
		CodigoPessoaFisica cpf = new CodigoPessoaFisica();
		
		boolean EsperadoResult = false;
		
		Assert.assertEquals(EsperadoResult, cpf.validaCPF("111.444.777-05"));		
	}
	
	@Test
	public void testeRemoveCaracteresEspeciais(){
		
		CodigoPessoaFisica cpf = new CodigoPessoaFisica();
		
		String EsperadoResult = "11144477705";
		
		Assert.assertEquals(EsperadoResult, cpf.removeCaracteresEspeciais("111.444.777-05"));
		
	}
}