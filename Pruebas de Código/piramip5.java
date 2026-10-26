void main ()
{
	
	int fila=0;
    IO.println("Dame un número de filas positivos enteros (no mayor a 20)");
	fila=Integer.parseInt(IO.readln());
    IO.println("Cantidad de filas:" + fila);
	if (fila>0 && fila<=20) 
	{
		is(fila);
	}
	else
	{
		IO.println("No cumple con el número de filas positivos");
	}
}
void is(int fila)
{
	for (int i = fila; i>=1; i--)
	{
		js(i,fila);
		ks(i);
	}
}
void js (int i, int fila)
{
	for (int j = 1; j<=(fila-i); j++)
	{
		IO.print(" ");
	}
}
void ks (int i)
{
	for(int k=1; k<=i; k++)
	{
	IO.print("*");
	}
		
	IO.println();
}