package com.exercicio.calculadora_teste;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CalculadoraTesteApplicationTests {

	// Testa o método de adição
	@Test
	void testAdicao() throws Exception {
		// Cria uma instancia da Calculadora
		Calculadora calculadora = new Calculadora();
		// Verifica se a soma de 2 e 3 é igual a 5
		assertEquals(5.0, calculadora.calcular(2.0, 3.0, 1), "A soma de 2 e 3 deve ser 5");
	}

	// Testa o metodo de subtração
	@Test
	void testSubtracao() throws Exception {
		Calculadora calculadora = new Calculadora();
		// Verifica se a subtração de 5 e 3 é igual a 2
		assertEquals(2.0, calculadora.calcular(5.0, 3.0, 2), "A subtração de 5 e 3 deve ser 2");
	}

	// Testa o metodo de multiplicação
	@Test
	void testMultiplicacao() throws Exception {
		Calculadora calculadora = new Calculadora();
		// Verificando se a multiplicação de 2 e 3 é igual a 6
		assertEquals(6.0, calculadora.calcular(2.0, 3.0, 3), "A multiplicação de 2 e 3 deve ser 6");
	}

	// Testa o metodo de divisão
	@Test
	void testDivisao() throws Exception {
		Calculadora calculadora = new Calculadora();
		// Verificando se a divisão de 6 por 3 é igual a 2
		assertEquals(2.0, calculadora.calcular(6.0, 3.0, 4), "A divisão de 6 por 3 deve ser 2");
	}

	// Testa o comportamento ao dividir por zero
	@Test
	void testDivisaoPorZero() {
		Calculadora calculadora = new Calculadora();
		// Verificando se uma exceção é lançada ao tentar dividir por zero
		Exception exception = assertThrows(Exception.class, () -> {
			calculadora.calcular(6.0, 0.0, 4);
		});
		assertEquals("Erro: Divisão por zero não é permitido!", exception.getMessage());
	}

	// Testa o metodo de porcentagem
	@Test
	void testPorcentagem() throws Exception {
		Calculadora calculadora = new Calculadora();
		// Verifica se 10% de 200 é igual a 20
		assertEquals(20.0, calculadora.calcular(200.0, 10.0, 5), "10% de 200 deve ser 20");
	}

	// Testa o comportamento para uma operação invalida
	@Test
	void testOperacaoInvalida() {
		Calculadora calculadora = new Calculadora();
		// Verifica se uma exceção é lançada para uma operação inválida
		Exception exception = assertThrows(Exception.class, () -> {
			calculadora.calcular(7.0, 3.0, 99);
		});
		assertEquals("Operação inválida!", exception.getMessage());
	}

}
