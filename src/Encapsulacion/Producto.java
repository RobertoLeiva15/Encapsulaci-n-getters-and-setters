package Encapsulacion;

public class Producto {

		// ATRIBUTOS PRIVADOS
		private String codigo;
		private String nombre;
		private double precio;
		private int stock;

		// CONSTRUCTOR
		public Producto(String codigo, String nombre, double precio, int stock) {
			this.codigo = codigo;
			this.nombre = nombre;
			setPrecio(precio); // validamos
			setStock(stock);   // validamos
		}

		// GETTERS Y SETTERS

		public String getCodigo() {
			return codigo;
		}

		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public double getPrecio() {
			return precio;
		}

		public void setPrecio(double precio) {
			if (precio > 0) {
				this.precio = precio;
			} else {
				System.out.println("Precio invalido, se asigna 1");
				this.precio = 1;
			}
		}

		public int getStock() {
			return stock;
		}

		public void setStock(int stock) {
			if (stock >= 0) {
				this.stock = stock;
			} else {
				System.out.println("Stock invalido, se asigna 0");
				this.stock = 0;
			}
		}

		// METODO VENDER
		public void vender(int cantidad) {
			if (cantidad <= stock) {
				stock -= cantidad;
				System.out.println("Venta realizada");
			} else {
				System.out.println("No hay suficiente stock");
			}
		}

		// MOSTRAR DATOS
		public void mostrar() {
			System.out.println("Codigo: " + codigo + 
							   " Nombre: " + nombre + 
							   " Precio: " + precio + 
							   " Stock: " + stock);
		}
	}