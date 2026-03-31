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
				
				// Clase Producto
				System.out.println("\n===== PRODUCTO =====");

				Producto prod1 = new Producto("P01", "Laptop", 8000, 5);
				Producto prod2 = new Producto("P02", "Mouse", 120, 2);

				// Probar ventas
				prod1.vender(3); // sí hay stock
				prod2.vender(5); // no hay suficiente

				prod1.mostrar();
				prod2.mostrar();
	}
}