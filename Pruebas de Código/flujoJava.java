void main ()

{ 
	//Variables

	int calificacion1=10;
	int calificacion2=10;
	int calificacion3=10;
	int calificacion4=10;
	double promedio= (calificacion1+calificacion2+calificacion3+calificacion4)/4;

	System.out.println( " Calificaciones: " );
	System.out.println( " Calificación 1: " + calificacion1);
	System.out.println( " Calificación 2: " + calificacion2);
	System.out.println( " Calificación 3: " + calificacion3);
	System.out.println( " Calificación 4: " + calificacion4);
	System.out.println( " Promedio total: "	+ promedio ); 

	System.out.println(  "Tú nivel es:" );	

	if (promedio<5)
	{ 
          System.out.println( "Pelas" ); 
	} 

	if (promedio==5)
	{
	  System.out.println( "Reprobasste" );
	}

	if (promedio>6)
	{
	  System.out.println( "Pasar es pasar" );
	}

	else if (promedio==10)

	{
	  System.out.println( "¡Excelente!" );
	}

}
