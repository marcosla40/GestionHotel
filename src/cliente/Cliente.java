package cliente;

public abstract class Cliente {
	private String nombre, direccion, tlf, codCliente;

	public Cliente(String nombre, String direccion, String tlf, String codCliente) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.tlf = tlf;
		this.codCliente = codCliente;
	}

	public String obtenerNombre() {
		return nombre;
	}

	public String obtenerDireccion() {
		return direccion;
	}

	public String obtenerTelefono() {
		return tlf;
	}	
}
