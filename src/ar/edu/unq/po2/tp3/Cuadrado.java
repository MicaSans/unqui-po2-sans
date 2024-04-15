package ar.edu.unq.po2.tp3;

public class Cuadrado extends Rectangulo{

	//Variable de instancia
	private float lado;
	
	//Constructor
	public Cuadrado(Point puntoC, float ladoC) {
		super(puntoC, ladoC, ladoC);
		this.lado = ladoC;
	}
	
	//Metodos
	@Override
	public double obtenerArea() {
		return Math.pow(this.lado,2);
	}
	
	@Override
	public float obtenerPerimetro() {
		return this.lado * 4;
	}
}
