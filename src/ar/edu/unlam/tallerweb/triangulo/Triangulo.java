package ar.edu.unlam.tallerweb.triangulo;

public class Triangulo {
	
	Double base;
	Double altura;
	
	public Triangulo (Double base, Double altura){
		this.base = base;
		this.altura = altura;
	}
	
	public Double calcularAreaTriangulo(){
		Double area = (Math.sqrt(3)/4) * (base * base);
		return area;
	}
	
	public Double calcularPerimetroTriangulo(){
		Double perimetro = base * 3;
		return perimetro;
	}
	
	

}
