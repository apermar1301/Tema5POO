package ejercicio5Records;

public class GestionProductos {

	public static void main(String[] args) {

		Producto pc = new Producto(1, "PC", 1000);
		Producto tostadora = new Producto(2, "TOSTADORA", 1000);

		System.out.println(pc);
		System.out.println(tostadora);

		pc.aplicarDescuento(25);

		System.out.println(pc);
		System.out.println(tostadora);

	}

}
