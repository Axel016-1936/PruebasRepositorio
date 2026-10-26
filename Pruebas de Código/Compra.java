public class Compra {
      public static void main(String[] args) {

		System.out.println("------------TIENDA JAVA------------");
                
                double precioProducto = 350.0;
                int cantidad = 4;
                double saldoCliente = 2000.0;
                int edadCliente = 28;

                boolean esClienteFrecuente = true;
                boolean tieneCupon = false;
                double Subtotal = precioProducto * cantidad;
                double IVA = Subtotal * 0.05;
                double Total = Subtotal + IVA;
		
		System.out.println("Precio del producto: " + (precioProducto));
		System.out.println("Cantidad de productos: " + (cantidad));
                System.out.println("Subtotal: " +  Subtotal);
                System.out.println("Cargo por el servicio: " + IVA);
                System.out.println("Total: " + Total);

                
                double TotalCompra = Total;
                TotalCompra+=100;
                System.out.println("Despues del envio: " + TotalCompra);
                TotalCompra-=50;
                System.out.println("Después de la promoción: " + TotalCompra);

		System.out.println("------------VALIDACIONES------------");
    


                System.out.println("¿Es mayor de edad?: " + (edadCliente >= 18));
                System.out.println("¿Tiene saldo suficiente?: " + (saldoCliente >= TotalCompra));
                System.out.println("¿Compra más de 3 productos?: " + (cantidad > 3));
		System.out.println( "¿Es cliente frecuente?: " + (esClienteFrecuente));

                boolean PuedeComprar = (edadCliente >= 18) && (saldoCliente >= TotalCompra);
                boolean DerechoDescuento = (esClienteFrecuente = true) || (tieneCupon = true);
                boolean CompraEspecial = (cantidad >= 3) && (DerechoDescuento);
                boolean NoCupon = !tieneCupon;
                System.out.println("Puede comprar: " + PuedeComprar);
                System.out.println("Derecho descuento: " + DerechoDescuento);
                System.out.println ("Compra especial: " + CompraEspecial);
                System.out.println ("Tiene cupon: " + NoCupon);

                boolean CompraPremium = (edadCliente >= 18) && (saldoCliente >= TotalCompra) && 		(Total > 1000) && (esClienteFrecuente || tieneCupon);
                System.out.println("Compra Premium: " + CompraPremium);

		

        }
}
