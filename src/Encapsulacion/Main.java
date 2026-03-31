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
				
				// Termometro inteligente
				System.out.println("\n===== TERMOMETRO =====");

				Termometro t1 = new Termometro(25);
				Termometro t2 = new Termometro(-300); // Prueba de validacion

				t1.mostrar();
				t2.mostrar();
				
				// Reloj con formato
				System.out.println("\n===== RELOJ =====");

				Reloj r1 = new Reloj(14, 30, 45);
				Reloj r2 = new Reloj(25, 70, -5); // Prueba de validacion

				System.out.println("Hora 1: " + r1.mostrarHora());
				System.out.println("Hora 2: " + r2.mostrarHora());

				// Contacto con telefono
				System.out.println("\n===== CONTACTO =====");

				Contacto cont1 = new Contacto("Roberto Leiva", "50394241", "robertoleiva155@gmail.com");
				Contacto cont2 = new Contacto("Suri Lopez", "15401", "correo_invalido"); // Prueba de validacion

				cont1.mostrarContacto();
				cont2.mostrarContacto();
				
				// Juego con puntaje maximo
				System.out.println("\n===== JUEGO CON PUNTAJE MAXIMO=====");

				Jugador j1 = new Jugador("Roberto", 50);
				Jugador j2 = new Jugador("Suri", 90);
				
				// Prueba de validacion
				j1.actualizarPuntaje(80);  // nuevo maximo
				j1.actualizarPuntaje(60);  // no supera el maximo
				j1.actualizarPuntaje(-10); // invalido

				j1.mostrar();
				j2.mostrar();
				
				
				
	}
}