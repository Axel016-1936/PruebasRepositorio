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
		IO.println("El numero excede con el numero de filas delimitada");
	}
}
void is(int fila)
{
	for (int i = 1; i<=fila; i++)
	{
		js(i,fila);
		ks(i);
		kz(i);
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
}
void kz (int i)
{
	for (int k=1; k<=(i-1); k++ )
	{	
	IO.print("*");
	}
	IO.println();
}
