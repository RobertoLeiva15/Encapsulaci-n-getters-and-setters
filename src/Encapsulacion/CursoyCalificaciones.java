package Encapsulacion;

public class CursoyCalificaciones {

		// ATRIBUTOS PRIVADOS
		private String nombreCurso;
		private double nota1;
		private double nota2;
		private double nota3;

		// CONSTRUCTOR
		public CursoyCalificaciones(String nombreCurso, double nota1, double nota2, double nota3) {
			this.nombreCurso = nombreCurso;
			setNota1(nota1); // validamos
			setNota2(nota2); // validamos
			setNota3(nota3); // validamos
		}

		// GETTERS Y SETTERS

		public String getNombreCurso() {
			return nombreCurso;
		}

		public void setNombreCurso(String nombreCurso) {
			this.nombreCurso = nombreCurso;
		}

		public double getNota1() {
			return nota1;
		}

		public void setNota1(double nota1) {
			if (nota1 >= 0 && nota1 <= 100) {
				this.nota1 = nota1;
			} else {
				System.out.println("Nota1 invalida, se asigna 0");
				this.nota1 = 0;
			}
		}

		public double getNota2() {
			return nota2;
		}

		public void setNota2(double nota2) {
			if (nota2 >= 0 && nota2 <= 100) {
				this.nota2 = nota2;
			} else {
				System.out.println("Nota2 invalida, se asigna 0");
				this.nota2 = 0;
			}
		}

		public double getNota3() {
			return nota3;
		}

		public void setNota3(double nota3) {
			if (nota3 >= 0 && nota3 <= 100) {
				this.nota3 = nota3;
			} else {
				System.out.println("Nota3 invalida, se asigna 0");
				this.nota3 = 0;
			}
		}

		// METODOS

		// Calcular promedio
		public double promedio() {
			return (nota1 + nota2 + nota3) / 3;
		}

		// Estado del curso
		public String estado() {
			if (promedio() >= 61) {
				return "Aprobado";
			} else {
				return "Reprobado";
			}
		}

		// Mostrar datos
		public void mostrar() {
			System.out.println("Curso: " + nombreCurso +
							   " Promedio: " + promedio() +
							   " Estado: " + estado());
		}
	}