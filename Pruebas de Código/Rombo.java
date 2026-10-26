void main ()
{
   int fila=5;
   /*Unificamos los códigos de "Piramidefull" y "Piramidefulnegativa" para generar el rombo*/
    for(int i = 1; i<=fila; i++)
	{
		
		for (int j = 1; j<=(fila-i); j++)
		{
			IO.print(" ");
		}
		for(int k=1; k<=i; k++)
		{
			IO.print("*");
		}
		for (int k=1; k<=(i-1); k++ )
		{	
			IO.print("*");
		}
	
	    IO.println();
	}

	for (int i = fila; i>=1; i--)
	{
		
		for (int j = 1; j<=(fila-i); j++)
		{
			IO.print(" ");
		}
		for(int k=1; k<=i; k++)
		{
			IO.print("*");
		}
		for (int k=1; k<=(i-1); k++ )
		{	
			IO.print("*");
		}
	
	    IO.println();
	}
}	