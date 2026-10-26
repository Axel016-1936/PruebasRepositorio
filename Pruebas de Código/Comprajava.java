public class Comprajava {
      public static void main(String[] args) {
      
      double precioProducto = 350.0;
      int cantidad = 4;
      double saldoCliente = 2000.0;
      int edadCliente = 28;
      boolean esClienteFrecuente = true;
      boolean tieneCupon = false;
	
	double subtotal= precioProducto*cantidad;
	double cargoservicio= subtotal*0.05;
	double Total= subtotal + cargoservicio;

	System.out.println( "----------Tienda Java---------");
	System.out.println( "Precio producto:  " + precioProducto);
	System.out.println( "Cantidad: " + cantidad);
	System.out.println( "Subtotal: " + subtotal);
	System.out.println( "Cargo por servicio: " + cargoservicio);
	System.out.println( "Total: " + Total );

	double TotalCompra = Total;
                TotalCompra+=100;
                System.out.println("Total de envío: " + TotalCompra);
                TotalCompra-=50;
                System.out.println("Total con promoción: " + TotalCompra);

	System.out.println( "----------Validaciones----------" ); 
	
	System.out.println( " ¿Es mayor de edad?: " + (edadCliente>=18));
	System.out.println( " ¿Tiene saldo suficiente?: " + (saldoCliente>=TotalCompra)); 
	System.out.println( " ¿Compra más de tres cantidades?: " + (cantidad>3));
	System.out.println( " ¿El total es exactamente a $1500?: " + (TotalCompra==1500)); 
	
	boolean nocupon= ( tieneCupon != false);
	boolean puedeComprar= (edadCliente>=18) && (saldoCliente>=TotalCompra);
	boolean descuento= (esClienteFrecuente == true) || (tieneCupon == false);
	boolean compraespecial= (cantidad>3) && (esClienteFrecuente == true) || (tieneCupon ==  	false);
	
	System.out.println( "¿Tiene cupon?: " + nocupon);
	System.out.println( "Puede comprar: " + puedeComprar);	
	System.out.println( "Tiene descuento: " + descuento);
	System.out.println( "Compra especial: " + compraespecial);

	boolean comprapremium= (edadCliente>=18) && (saldoCliente>=TotalCompra) &&    	(TotalCompra>1000) && (esClienteFrecuente == true) && ( tieneCupon == true);

	System.out.println( "Compra Premium: " + comprapremium); 




  }
}