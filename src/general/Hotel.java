package general;

import habitacion.Habitacion;
import cliente.Cliente;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
	private String nombre;
	private int numeroEstrellas, numeroHabitaciones;
	
	private List<Habitacion> habitaciones;
    private List<Cliente> clientes;
    private List<Reserva> reservas;
	
	public Hotel(String nombre, int numeroEstrellas, int numeroHabitaciones) {
		super();
		this.nombre = nombre;
		this.numeroEstrellas = numeroEstrellas;
		this.numeroHabitaciones = numeroHabitaciones;
	}

	public String obtenerNombre() {
		return nombre;
	}

	public int obtenerNumeroEstrellas() {
		return numeroEstrellas;
	}

	
	public void anadirHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }
	
	public void borrarCliente(Cliente cliente) {
        if (clientes.remove(cliente)) {
            System.out.println("Cliente eliminado correctamente.");
        } else {
            System.out.println("Cliente no encontrado.");
        }
    }
	
	public void registrarReserva(Reserva reserva) {
        if (habitaciones.contains(reserva.getHabitacion())) {
            reservas.add(reserva);
            System.out.println("Reserva registrada con éxito.");
        } else {
            System.out.println("Error: La habitación no pertenece a este hotel.");
        }
    }	
}
