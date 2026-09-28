public class MainInventario {

	public static void main(String[] args) {
		Producto productoUno = new Producto();
		productoUno.codigo = "P-001";
		productoUno.nombre = "Teclado mecánico";
		productoUno.precio = 45000.0;
		productoUno.stock = 12;

		Producto productoDos = new Producto();
		productoDos.codigo = "P-002";
		productoDos.nombre = "Mouse inalámbrico";
		productoDos.precio = 18000.0;
		productoDos.stock = 20;

		Producto productoTres = new Producto();
		productoTres.codigo = "P-003";
		productoTres.nombre = "Monitor";
		productoTres.precio = 120000.0;
		productoTres.stock = 5;

		productoUno.mostrarFicha();
		productoDos.mostrarFicha();
		productoTres.mostrarFicha();

		productoUno.venderUnidades(3);
		productoUno.venderUnidades(50);
		productoUno.reponerStock(20);
		productoUno.actualizarPrecio(39900.0);
        productoUno.venderUnidades(-5); // Intento de venta con cantidad negativa
        productoUno.venderUnidades(0); // Intento de venta con cantidad cero
        productoUno.venderUnidades(15); // Intento de venta con cantidad mayor al stock
		productoUno.reponerStock(20);
		productoUno.actualizarPrecio(39900.0);
		Producto copia = productoUno;
		copia.stock = 29;

		System.out.println("Stock de productoUno tras modificar copia: " + productoUno.stock
				+ " (misma referencia al objeto en el Heap)");
		System.out.println("Stock de productoDos, sin cambios: " + productoDos.stock);
		System.out.println("Stock de productoTres, sin cambios: " + productoTres.stock);
	}
}