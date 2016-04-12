package ar.edu.unlam.tallerweb.triangulo;

import junit.framework.Assert;

import org.junit.Test;

public class TestTriangulo {

	@Test
	public void testQueCalculaElArea(){
		Triangulo trianguloPrueba = new Triangulo(2.0, 5.0);
		Double resultado = trianguloPrueba.calcularAreaTriangulo();
		Assert.assertEquals(1.73, resultado, 0.01);
	}

	@Test
	public void testQueCalculaElPerimetro(){
		Triangulo trianguloPrueba = new Triangulo(5.0, 4.0);
		Double resultado = trianguloPrueba.calcularPerimetroTriangulo();
		Assert.assertEquals(15.0, resultado, 0.01);
	}
}
