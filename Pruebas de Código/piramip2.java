void main() 
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
	for (int i =0; i<=fila; i++)
	{
		js(i);
	}	
}

void js (int i)
{
	for (int j = 0; j<=i; j++)
	{	
		IO.print("*");
	}
	IO.println();
}