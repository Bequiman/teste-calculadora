package calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
	private Calculadora calc;
	
	@Test
	public void testeConstrutorSemParametro() {
		//definir cenário
		int resultadoEsperado = 0;
		
		//executar
		calc = new Calculadora();
		int resultadoObtido = calc.getMemoria();
		
		//comparar
		//terceiro parametro inseriu uma mensagem personalida
		assertEquals(resultadoEsperado, resultadoObtido,"Construtor vazio com falha, inicializa a memório correta");
	}

	@Test
	public void testeConstrutorComParametro(){
		calc = new Calculadora(3);
		int resultadoEsperado = 3;
		int resultadoObtido = calc.getMemoria();
		assertEquals(resultadoEsperado, resultadoObtido);
	}

	@Test
	public void testeSomarNumeroNegativo(){
		calc = new Calculadora(3);
		calc.somar(-2);
		int resultadoEsperado = 1;
		int resultadoObtido = calc.getMemoria();
		assertEquals(resultadoEsperado, resultadoObtido);

	}

	@Test
	public void testeSubtrairNumeroPositivo(){
		calc = new Calculadora(3);
		calc.subtrair(2);
		assertEquals(1, calc.getMemoria());
	}

	@Test
	public void testeMultiplicarNumeroPositivo(){
		calc = new Calculadora(3);
		calc.multiplicar(2);
		int resultadoEsperado = 6;
		int resultadoObtido = calc.getMemoria();
		assertEquals(resultadoEsperado, resultadoObtido);
	}

	@Test
	public void testeDividirNumeroPositivo() throws Exception {
		calc = new Calculadora(3);
		calc.dividir(3);
		int resultadoEsperado = 1;
		int resultadoObtido = calc.getMemoria();
		assertEquals(resultadoEsperado, resultadoObtido);
	}

	@Test
	public void testarDividirZero() throws Exception {
		calc = new Calculadora(3);
		calc.dividir(0);
		Assertions.assertEquals(3, calc.getMemoria());
	}


	/*

	@Test
	public void testeDividirZero() throws Exception { //Exception
		calc = new Calculadora(3);
		Assertions.assertThrows(Exception.class,()->calc.dividir(0)); //Exception
		//Assertions.assertThrows(Exception.class,()->calc.dividir(0));
		//Assertions.assertThrows(Exception.class, () -> {calc.dividir(0);});
	}

	 */


	@Test
	public void testarExponenciacao1() throws Exception {
		calc = new Calculadora(3);
		calc.exponenciar(1);
		int resultadoEsperado = 1995565057;
		int resultadoObtido = calc.getMemoria();
		assertEquals(resultadoEsperado, resultadoObtido);
	}

	/*

	@Test
	public void testeExponenciacao1() throws Exception {
		calc = new Calculadora();
		Assertions.assertThrows(Exception.class,()->calc.exponenciar(1));
	}

	 */

	@Test
	public void testarExponenciacao10() throws Exception {
		calc = new Calculadora(3);
		calc.exponenciar(10);
		int resultadoEsperado = 1995565057;
		int resultadoObtido = calc.getMemoria();
		assertEquals(resultadoEsperado, resultadoObtido);
	}

	@Test
	public void testarExponenciacaoMaior10() throws Exception {
		calc = new Calculadora(3);
		calc.exponenciar(11);
		int resultadoEsperado = 0;
		int resultadoObtido = calc.getMemoria();
		assertEquals(resultadoEsperado, resultadoObtido);
	}

	@Test
	public void zerarMemória() throws Exception {
		calc = new Calculadora(3);
		calc.zerarMemoria();
		int resultadoEsperado = 0;
		int resultadoObtido = calc.getMemoria();
		assertEquals(resultadoEsperado, resultadoObtido);
	}

}
