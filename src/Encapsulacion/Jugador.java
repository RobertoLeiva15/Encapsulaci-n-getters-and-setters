package Encapsulacion;

public class Jugador {
	
		// ATRIBUTOS PRIVADOS
		private String nombre;
		private int puntajeActual;
		private int puntajeMaximo;

		// CONSTRUCTOR
		public Jugador(String nombre, int puntajeActual) {
			this.nombre = nombre;
			setPuntajeActual(puntajeActual); // validamos
			this.puntajeMaximo = this.puntajeActual; // inicia igual
		}

		// GETTERS Y SETTERS

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public int getPuntajeActual() {
			return puntajeActual;
		}

		public void setPuntajeActual(int puntajeActual) {
			// Validamos que no sea negativo
			if (puntajeActual >= 0) {
				this.puntajeActual = puntajeActual;
			} else {
				System.out.println("Puntaje invalido, se asigna 0");
				this.puntajeActual = 0;
			}
		}

		public int getPuntajeMaximo() {
			return puntajeMaximo;
		}

		// METODOS

		// Actualizar puntaje
		public void actualizarPuntaje(int nuevoPuntaje) {
			setPuntajeActual(nuevoPuntaje); // validamos

			if (puntajeActual > puntajeMaximo) {
				puntajeMaximo = puntajeActual;
				System.out.println("Nuevo puntaje maximo alcanzado");
			}
		}

		// Mostrar datos
		public void mostrar() {
			System.out.println("Nombre: " + nombre +
							   " Puntaje Actual: " + puntajeActual +
							   " Puntaje Maximo: " + puntajeMaximo);
		}
	}