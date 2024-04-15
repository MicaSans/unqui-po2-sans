package ar.edu.unq.po2.tp3;

public class Rectangulo {

	//Variables de instancia
	private float puntoX;
	private float puntoY;
	private float ancho;
	private float alto;
	
	//Constructor
	public Rectangulo(Point puntoRec, float anchoRec, float altoRec) {
		this.puntoX = puntoRec.getX();
		this.puntoY = puntoRec.getY();
		this.setAncho(anchoRec);
		this.setAlto(altoRec);
	}
	
	//Metodos
	public double obtenerArea() {
		return this.ancho * this.alto;
	}
	
	public float obtenerPerimetro() {
		return (this.ancho * 2) + (this.alto * 2);
	}
	
	public boolean esHorizontal() {
		return this.getAlto() < this.getAncho();
	}
	
	public boolean esVertical() {
		return this.getAlto() > this.getAncho();
	}

	//Getters
	public float getPuntoX() {
		return puntoX;
	}

	public float getPuntoY() {
		return puntoY;
	}

	public float getAncho() {
		return ancho;
	}

	public float getAlto() {
		return alto;
	}

	//Setters
	public void setPuntoX(float puntoX) {
		this.puntoX = puntoX;
	}

	public void setPuntoY(float puntoY) {
		this.puntoY = puntoY;
	}

	public void setAncho(float ancho) {
		this.ancho = ancho;
	}

	public void setAlto(float alto) {
		this.alto = alto;
	}
}
