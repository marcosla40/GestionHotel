package general;

import cliente.Cliente;
import habitacion.Habitacion;

public class Reserva {
	private String fechaEntrada;
	private int numeroDias;
	
	private Hotel hotel;
	private Cliente cliente;
	private Habitacion habitacion;
	
	public Reserva(String fechaEntrada, int numeroDias, Hotel hotel, Cliente cliente, Habitacion habitacion) {
		this.fechaEntrada = fechaEntrada;
		this.numeroDias = numeroDias;
		this.hotel = hotel;
		this.cliente = cliente;
		this.habitacion = habitacion;
	}

	public double calcularPrecio() {
		return numeroDias * habitacion.obtenerPrecio();
	}
	
	public Habitacion getHabitacion() {
        return habitacion;
    }
}
