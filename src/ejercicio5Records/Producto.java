package ejercicio5Records;

public record Producto(int id, String nombre, double precio) {

	public Producto {

		if (id < 0 || nombre.isBlank() || nombre == null || precio < 0) {
			throw new IllegalArgumentException();
		}

	}

	public Producto aplicarDescuento(double descuento) {

		if (descuento < 0 || descuento > 100) {
			throw new IllegalArgumentException();
		}

		return new Producto(id, nombre, precio - (precio * (descuento / 100)));
	}

}
