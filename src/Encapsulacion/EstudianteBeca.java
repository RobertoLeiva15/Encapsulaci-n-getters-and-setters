package Encapsulacion;

public class EstudianteBeca {
	
		// ATRIBUTOS PRIVADOS
		private String carnet;
		private String nombre;
		private double promedio;

		// CONSTRUCTOR
		public EstudianteBeca(String carnet, String nombre, double promedio) {
			this.carnet = carnet;
			this.nombre = nombre;
			setPromedio(promedio); // validamos
		}

		// GETTERS Y SETTERS

		public String getCarnet() {
			return carnet;
		}

		public void setCarnet(String carnet) {
			this.carnet = carnet;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public double getPromedio() {
			return promedio;
		}

		public void setPromedio(double promedio) {
			if (promedio >= 0 && promedio <= 100) {
				this.promedio = promedio;
			} else {
				System.out.println("Promedio invalido, se asigna 0");
				this.promedio = 0;
			}
		}

		// METODOS

		// Verificar si tiene beca
		public boolean esBecado() {
			if (promedio >= 85) {
				return true;
			} else {
				return false;
			}
		}

		// Mostrar datos
		public void mostrar() {
			System.out.println("Carnet: " + carnet +
							   " Nombre: " + nombre +
							   " Promedio: " + promedio +
							   " Becado: " + esBecado());
		}
	}