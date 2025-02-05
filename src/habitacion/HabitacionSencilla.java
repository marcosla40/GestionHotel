package habitacion;

public class HabitacionSencilla extends Habitacion{
	private boolean esExterior;

	public HabitacionSencilla(int numero, String tipo, double precio, boolean esExterior) {
		super(numero, tipo, precio);
		this.esExterior = esExterior;
		// TODO Auto-generated constructor stub
	}
}
