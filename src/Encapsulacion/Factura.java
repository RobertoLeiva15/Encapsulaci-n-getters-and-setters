package Encapsulacion;

public class Factura {

		// ATRIBUTOS PRIVADOS
		private String codigoFactura;
		private String descripcion;
		private int cantidad;
		private double precioUnitario;

		// CONSTRUCTOR
		public Factura(String codigoFactura, String descripcion, int cantidad, double precioUnitario) {
			this.codigoFactura = codigoFactura;
			this.descripcion = descripcion;
			setCantidad(cantidad);           // validamos
			setPrecioUnitario(precioUnitario); // validamos
		}

		// GETTERS Y SETTERS

		public String getCodigoFactura() {
			return codigoFactura;
		}

		public void setCodigoFactura(String codigoFactura) {
			this.codigoFactura = codigoFactura;
		}

		public String getDescripcion() {
			return descripcion;
		}

		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}

		public int getCantidad() {
			return cantidad;
		}

		public void setCantidad(int cantidad) {
			if (cantidad > 0) {
				this.cantidad = cantidad;
			} else {
				System.out.println("Cantidad invalida, se asigna 1");
				this.cantidad = 1;
			}
		}

		public double getPrecioUnitario() {
			return precioUnitario;
		}

		public void setPrecioUnitario(double precioUnitario) {
			if (precioUnitario > 0) {
				this.precioUnitario = precioUnitario;
			} else {
				System.out.println("Precio invalido, se asigna 1");
				this.precioUnitario = 1;
			}
		}

		// METODOS

		// Calcular total
		public double calcularTotal() {
			return cantidad * precioUnitario;
		}

		// Mostrar factura
		public void mostrarFactura() {
			System.out.println("Codigo: " + codigoFactura +
							   " Descripcion: " + descripcion +
							   " Cantidad: " + cantidad +
							   " Precio Unitario: " + precioUnitario +
							   " Total: " + calcularTotal());
		}
	}