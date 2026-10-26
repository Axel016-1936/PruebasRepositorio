void main ()

{
	//Variables de precios
	int Huevo=39;
	int Frijol=30;
	int Arroz=60;
	int Tortillas=26;

		System.out.println( "----------Productos----------" );
		System.out.println( "Huevo: 1Kg cuesta $" + Huevo);
		System.out.println( "Frijol: 1Kg cuesta $" + Frijol );
		System.out.println( "Arroz: 1Kg cuesta $" + Arroz );
		System.out.println( "Tortillas: 1kg cuesta $" + Tortillas );

	int cantidadHuevo=3;
	int cantidadFrijol=2;
	int cantidadArroz=2;
	int cantidadTortillas=1;

		System.out.println( "----------Cantidad----------" );   
		System.out.println( " Cantidad de Huevos: " + cantidadHuevo + "Kg");
		System.out.println( " Cantidad de Frijoles: " + cantidadFrijol + "Kg");		
		System.out.println( " Cantidad de Arroz: " + cantidadArroz + "Kg");
		System.out.println( " Cantidad de Tortillas: " + cantidadTortillas + "Kg");

	double subTotal= (Huevo*cantidadHuevo)+(Frijol*cantidadFrijol)+(Arroz*cantidadArroz)+(Tortillas*cantidadTortillas);
		System.out.println( "----------------------------" );
		System.out.println( "Subtotal: $" + subTotal  );
	
	double Descuento=0;	

	if (subTotal>=1000)
	{
		Descuento=subTotal*0.10;
		System.out.println( " Descuento: " + Descuento);
	}
	
	else
	{
		Descuento=0;
		System.out.println( "Descuento:" + Descuento );
	}
	
	System.out.println( "----------------------------");
	double Total=subTotal-Descuento;
	System.out.println( " Total: $" + Total);
}