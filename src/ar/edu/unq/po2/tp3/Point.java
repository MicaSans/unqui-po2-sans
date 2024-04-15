package ar.edu.unq.po2.tp3;

public class Point {

	//Variables de instancia
	private int x;
	private int y;
	
	//Constructor con valores predeterminados (0,0)
	public Point() {
		this.x = 0;
		this.y = 0;
	}
	
	//Constructor con valores como parametros
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//Metodos
	public void moverPunto(int nuevaX, int nuevaY) {
		this.x = nuevaX;
		this.y = nuevaY;
	}
	
	public Point sumarConOtroPunto (int otraX, int otraY) {
		int nuevaX = this.x + otraX;
		int nuevaY = this.y + otraY;
		return new Point (nuevaX, nuevaY);
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}
}
