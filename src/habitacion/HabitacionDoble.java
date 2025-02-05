package habitacion;

public class HabitacionDoble extends Habitacion {
	private boolean esMatrimonial;

	public HabitacionDoble(int numero, String tipo, double precio, boolean esMatrimonial) {
		super(numero, tipo, precio);
		this.esMatrimonial = esMatrimonial;
		// TODO Auto-generated constructor stub
	}
}
