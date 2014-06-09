package com.tdd.tranning.shapes;

import org.junit.Test;
import static org.junit.Assert.*;

public class TrianguloTest {

	@Test
	public void testeTrianguloEquilatero() {
		Triangulo triangulo = new Triangulo(5, 5, 5);
		assertEquals("O triangulo e equilatero", triangulo.retornaTipo());
	}

	@Test
	public void testeTrianguloIsoscelesXIgualY() {
		Triangulo triangulo = new Triangulo(5, 5, 3);
		assertEquals("O triangulo e isosceles", triangulo.retornaTipo());
	}

	@Test
	public void testeTrianguloIsoscelesYIgualZ() {
		Triangulo triangulo = new Triangulo(3, 5, 5);
		assertEquals("O triangulo e isosceles", triangulo.retornaTipo());
	}

	@Test
	public void testeTrianguloEscaleno() {
		Triangulo triangulo = new Triangulo(5, 7, 9);
		assertEquals("O triangulo e escaleno", triangulo.retornaTipo());
	}
	
	@Test
	public void testeTrianguloIsoscelesXIgualZ(){
		Triangulo triangulo = new Triangulo(5, 7, 5);
		assertEquals("O triangulo e isosceles", triangulo.retornaTipo());
	}
	
	@Test
	public void testeTrianguloTodosValoresZerados(){
		Triangulo triangulo = new Triangulo(0, 0, 0);
		assertEquals("Triangulo invalido", triangulo.retornaTipo());
	}
	@Test
	public void testeXZerado(){
		Triangulo triangulo = new Triangulo(0, 5, 5);
		assertEquals("Triangulo invalido", triangulo.retornaTipo());
	}
	
	@Test
	public void TestYZerado(){
		Triangulo triangulo = new Triangulo(5, 0, 5);
		assertEquals("Triangulo invalido", triangulo.retornaTipo());
	}
	
	@Test
	public void testZZerado(){
		Triangulo triangulo = new Triangulo(5, 5, 0);
		assertEquals("Triangulo invalido", triangulo.retornaTipo());
	}
	
	@Test
	public void testXYZerados(){
		Triangulo triangulo = new Triangulo(0, 0, 5);
		assertEquals("Triangulo invalido", triangulo.retornaTipo());
	}
	
	@Test
	public void testXZZerados(){
		Triangulo triangulo = new Triangulo(0, 5, 0);
		assertEquals("Triangulo invalido", triangulo.retornaTipo());
	}
	
	@Test
	public void testYZZerados(){
		Triangulo triangulo = new Triangulo(0, 5, 0);
		assertEquals("Triangulo invalido", triangulo.retornaTipo());
	}

}
