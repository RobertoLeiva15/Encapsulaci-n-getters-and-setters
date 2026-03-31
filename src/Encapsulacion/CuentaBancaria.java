package Encapsulacion;

public class CuentaBancaria {

		// ATRIBUTOS PRIVADOS
		private String titular;
		private double saldo;
		private int pin;

		// CONSTRUCTOR
		public CuentaBancaria(String titular, double saldo, int pin) {
			this.titular = titular;
			setSaldo(saldo); // validamos
			this.pin = pin;
		}

		// GETTERS Y SETTERS

		public String getTitular() {
			return titular;
		}

		public void setTitular(String titular) {
			this.titular = titular;
		}

		public double getSaldo() {
			return saldo;
		}

		public void setSaldo(double saldo) {
			if (saldo >= 0) {
				this.saldo = saldo;
			} else {
				System.out.println("Saldo invalido, se asigna 0");
				this.saldo = 0;
			}
		}

		public int getPin() {
			return pin;
		}

		public void setPin(int pin) {
			this.pin = pin;
		}

		// METODOS

		// Retirar dinero con validacion de PIN
		public void retirar(double monto, int pinIngresado) {
			if (pinIngresado == pin) {
				if (monto <= saldo) {
					saldo -= monto;
					System.out.println("Retiro realizado");
				} else {
					System.out.println("Saldo insuficiente");
				}
			} else {
				System.out.println("PIN incorrecto");
			}
		}

		// Mostrar datos
		public void mostrar() {
			System.out.println("Titular: " + titular + " Saldo: " + saldo);
		}
	}