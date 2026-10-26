void main ()
{
	
	int fila=5;
	
	/*Unicamente se cambia la condicíon a cumplir del "for" para que invierta su posición*/ 
	
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