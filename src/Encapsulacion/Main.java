package Encapsulacion;

public class Main {

	public static void main(String[] args) {

			// Clase Persona
				System.out.println("===== PERSONA =====");

				Persona p1 = new Persona("Roberto", "Leiva", 19);
				Persona p2 = new Persona("Carmen", "Salazar", 41);
				Persona p3 = new Persona("Mynor", "Leiva", 43);

				p1.mostrar();
				p2.mostrar();
				p3.mostrar();

				// Prueba de validación
				Persona p4 = new Persona("Pablo", "Guerra", -5);
				p4.mostrar();
	}
}