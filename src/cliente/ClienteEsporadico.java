package cliente;

public class ClienteEsporadico extends Cliente{
	private double descuento;

	public ClienteEsporadico(String nombre, String direccion, String tlf, String codCliente, double descuento) {
		super(nombre, direccion, tlf, codCliente);
		this.descuento = descuento;
	}
	
	public double almacenarDescuento() {
		return descuento;
	}

}
