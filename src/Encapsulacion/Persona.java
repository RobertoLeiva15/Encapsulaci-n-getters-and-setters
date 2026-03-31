package Encapsulacion;

public class Persona {
	
		// ATRIBUTOS
		private String nombre;
		private String apellido;
		private int edad;

		// CONSTRUCTOR
		public Persona(String nombre, String apellido, int edad) {
			this.nombre = nombre;
			this.apellido = apellido;
			setEdad(edad); // usamos el setter para validar
		}

		// GETTERS Y SETTERS

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			// Validamos que no sea negativa
			if (edad >= 0) {
				this.edad = edad;
			} else {
				System.out.println("La edad no puede ser negativa, se asigna 0");
				this.edad = 0;
			}
		}

		// METODO MOSTRAR
		public void mostrar() {
			System.out.println("Nombre: " + nombre + " " + apellido + " Edad: " + edad);
		}
	}