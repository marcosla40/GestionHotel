package habitacion;

public class HabitacionSuit extends Habitacion {
	private boolean tieneBanera;
	private boolean tieneSauna;
	private boolean tieneMirador;

	public HabitacionSuit(int numero, String tipo, double precio, boolean tieneBanera, boolean tieneSauna, boolean tieneMirador) {
		super(numero, tipo, precio);
		this.tieneBanera = tieneBanera;
		this.tieneSauna = tieneSauna;
		this.tieneMirador = tieneMirador;
		
		// TODO Auto-generated constructor stub
	}
}
