
public class Control\de\Compra\en\Java {
      public static void main(String[] args) { 	 

		//Operadores Aritmeticos
		double precioProducto = 350.0;	
		int cantidad = 4;
		double saldoCliente = 2000.0;
		int edadCliente = 28;
	
		boolean esClienteFrecuente = true;
		boolean tieneCupon = false;
		double Subtotal = precioProducto * cantidad;
		double IVA = Subtotal * 0.05;
		double Total = Subtotal + IVA;
		System.out.println("Subtotal" +  Subtotal);
		System.out.println("Cargo por el servicio" + IVA);
		System.out.println("Total" + Total);

		//Operadores de Asignación
		System.out.println("--------------------------------");
		double TotalCompra = Total;
		System.out.println("Total Inicial" + TotalCompra);
		TotalCompra+=100;
		System.out.println("Despues del envio" + TotalCompra);
		TotalCompra-=50;
		System.out.println("Después de la promoción" + TotalCompra);
	
		// Operadores de Comparación
		System.out.println("-------------------------------");
		System.out.println("¿Es mayor de edad?: " + edadCliente >= 18);
	}
}