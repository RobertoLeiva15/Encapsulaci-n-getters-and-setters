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
				
				// Cuenta con pin 
				System.out.println("\n===== CUENTA BANCARIA =====");

				CuentaBancaria c1 = new CuentaBancaria("Roberto Leiva", 1000, 1234);

				// Prueba de validacion (PIN correcto)
				c1.retirar(200, 1234);
				c1.mostrar();

				// Prueba de validacion (PIN incorrecto)
				c1.retirar(100, 1111);

				// Prueba de validacion (saldo insuficiente)
				c1.retirar(2000, 1234);
				
				// Curso y calificaciones
				System.out.println("\n===== CURSO Y CALIFICACIONES =====");

				CursoyCalificaciones curso1 = new CursoyCalificaciones("Matematica", 80, 70, 90);
				CursoyCalificaciones curso2 = new CursoyCalificaciones("Programacion", 50, 40, 60);

				// Prueba de validacion
				curso1.mostrar();
				curso2.mostrar();
				
				// Estudiante y beca
				System.out.println("\n===== ESTUDIANTE Y BECA =====");

				EstudianteBeca e1 = new EstudianteBeca("2025001", "Roberto Leiva", 90);
				EstudianteBeca e2 = new EstudianteBeca("2025002", "Suri Lopez", 70);

				// Prueba de validacion
				e1.mostrar();
				e2.mostrar();
				
				
	}
}