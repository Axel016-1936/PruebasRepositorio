void main()
{
	int fila=0;
	IO.println("Dame un número de filas positivos enteros (no mayor a 20)");
	fila=Integer.parseInt(IO.readln());
    IO.println("Cantidad de filas:" + fila);
	if (fila>0 && fila<=20) 
	{
		for(int i=0;i<fila;i++)
		{
			for (int j=0;j<fila;j++)
			{
				IO.print("*");
			}
			IO.println();
		}	
		IO.println();
	}
	else
	{
		IO.println("No cumple con el número de filas positivos");
	}
}