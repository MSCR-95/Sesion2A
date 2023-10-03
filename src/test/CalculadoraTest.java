package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Calculadora;

class CalculadoraTest {
	
	private int value1;
	private int value2;

	@BeforeAll //Se ejecuta una vez al principio
	static void setUpBeforeClass() throws Exception {
		System.out.println("Befrore All");
	}

	@AfterAll //Se ejecuta una sola vez al final
	static void tearDownAfterClass() throws Exception {
		System.out.println("After All");
	}

	@BeforeEach //Se ejecuta cada vez que se hace una prueba
	void setUp() throws Exception {
		System.out.println("Befrore each");
		value1 = 5;
		value2 = 3;
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Afther each");
	}

	@Test
	void testSuma() {

		int expected = 8;
		int actual = Calculadora.suma(value1,  value2);
		assertEquals(expected, actual);
	}

	@Test
	void testResta() {
		int expected = 2;
		int actual = Calculadora.resta(value1,  value2);
		assertEquals(expected, actual);
	}

	@Test
	void testMultiplica() {
		int expected = 15;
		int actual = Calculadora.multiplica(value1,  value2);
		assertEquals(expected, actual);
	}

	@Test
	void testDivide() {
		int expected = 1;
		int actual = Calculadora.divide(value1,  value2);
		assertEquals(expected, actual);
	}
	
	@Test
	void testDividePor0() {
		int expected = -1;
		value2 = 0; 
		int actual = Calculadora.divide(value1,  value2);
		assertEquals(expected, actual);
	}

}
