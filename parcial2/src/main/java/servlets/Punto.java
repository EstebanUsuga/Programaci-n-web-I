package servlets;

public class Punto {
	//Esta clase sirve para demostrar que podemos crear nuestros propios objetos y pasarlos como parámetros
	
	private double x;
	private double y;
	
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Punto: (" + x + ", " + y + ")";
	}
}

