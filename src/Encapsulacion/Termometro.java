package Encapsulacion;

public class Termometro {

		// ATRIBUTOS PRIVADOS
		private double celsius;

		// CONSTRUCTOR
		public Termometro(double celsius) {
			setCelsius(celsius); // validamos
		}

		// GETTERS Y SETTERS

		public double getCelsius() {
			return celsius;
		}

		public void setCelsius(double temperatura) {
			// Validamos que no sea menor al cero absoluto
			if (temperatura >= -273.15) {
				this.celsius = temperatura;
			} else {
				System.out.println("Temperatura invalida, se asigna -273.15");
				this.celsius = -273.15;
			}
		}

		// METODOS

		// Convertir a Fahrenheit
		public double getFahrenheit() {
			return (celsius * 9 / 5) + 32;
		}

		// Mostrar datos
		public void mostrar() {
			System.out.println("Celsius: " + celsius + 
							   " Fahrenheit: " + getFahrenheit());
		}
}
