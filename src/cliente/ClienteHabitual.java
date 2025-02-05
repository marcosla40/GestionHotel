package cliente;

public class ClienteHabitual extends Cliente{
	private boolean oferta;

	public ClienteHabitual(String nombre, String direccion, String tlf, String codCliente, boolean oferta) {
		super(nombre, direccion, tlf, codCliente);
		this.oferta = oferta;
	}
}
