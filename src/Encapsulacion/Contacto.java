package Encapsulacion;

public class Contacto {

		// ATRIBUTOS PRIVADOS
		private String nombre;
		private String telefono;
		private String email;

		// CONSTRUCTOR
		public Contacto(String nombre, String telefono, String email) {
			this.nombre = nombre;
			setTelefono(telefono); // validamos
			setEmail(email);       // validamos
		}

		// GETTERS Y SETTERS

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getTelefono() {
			return telefono;
		}

		public void setTelefono(String telefono) {
			// Validamos que tenga exactamente 8 digitos
			if (telefono != null && telefono.matches("\\d{8}")) {
				this.telefono = telefono;
			} else {
				System.out.println("Telefono invalido, debe tener 8 digitos");
				this.telefono = "00000000";
			}
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			// Validamos que contenga @
			if (email != null && email.contains("@")) {
				this.email = email;
			} else {
				System.out.println("Email invalido");
				this.email = "correo@default.com";
			}
		}

		// METODOS

		// Mostrar datos del contacto
		public void mostrarContacto() {
			System.out.println("Nombre: " + nombre +
							   " Telefono: " + telefono +
							   " Email: " + email);
		}
	}