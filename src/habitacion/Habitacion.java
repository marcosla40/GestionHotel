package habitacion;

public abstract class Habitacion {
	private int numero;
	private String tipo;
	private double precio;
	
	public Habitacion(int numero, String tipo, double precio) {
		super();
		this.numero = numero;
		this.tipo = tipo;
		this.precio = precio;
	}

	public double obtenerPrecio() {
		return precio;
	}
	
	public void mostrarFoto() {
		
	}
		
}
