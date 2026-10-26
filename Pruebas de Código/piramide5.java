void main ()
{
	
	int fila=0;
    IO.println("Dame un número de filas positivos enteros (no mayor a 20)");
	fila=Integer.parseInt(IO.readln());
    IO.println("Cantidad de filas:" + fila);
	if (fila>0 && fila<=20) 
	{
	
		//Cantidad de "*" a imprimir por fila
		for (int i = fila; i>=1; i--)
		{
			//Espacios que se dejan antes de imprimir "*"
			for (int j = 1; j<=(fila-i); j++)
			{
				IO.print(" ");
			}
			//Cantidad de columnas que hay por "i"
			for(int k=1; k<=i; k++)
			{
				IO.print("*");
			}
		
			IO.println();
		}
	}
	else 
	{
		IO.println("No cumple con el número de filas positivos");
	}
}	