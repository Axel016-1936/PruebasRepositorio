void main ()
{
	/* Lleva la misma logica del codigo "piramide2", de modo que varia la condición lógica 
	del triangulo para invertir su posición a traves de un decremento en el "for" principal.
	*/
	int fila=0;
    IO.println("Dame un número de filas positivos enteros (no mayor a 20)");
	fila=Integer.parseInt(IO.readln());
    IO.println("Cantidad de filas:" + fila);
	
	if (fila>0 && fila<=20) 
	{
		/*Este "for" principal  imprime la cantidad total de filas (fila=i), donde "i" es
		 igual a la variable "fila", cumpliendo la condición booleana de i>=1, donde "i" (es decir fila)
		 debe ser mayor o igual a 1 para que se impriman el total de asteriscos, es decir, si se escribe 5,
		 se imprimirá un total de 5 asteriscos en la primera fila como el valor mayor.
		 (despues del primer ciclo, hay un decremento del total de la variable "i" de uno en uno; 
		 Ejemplo: fila=5, por lo tanto, i=5 por lo que hay un decremento de 5 a 4, de 4 a 3
		 y así sucesivamente, imprimiendosé el numero de asteriscos correspondiente a la fila hasta llegar
		 a 1, donde se toma como "falso" a cualquier numero por debajo de 1.)
		
		*/
		for (int i = fila; i>=1; i--)
		{
			for (int j = 1; j<=i; j++)
			{
				IO.print("*");
			}
			IO.println();
		}
	}
	else 
	{
		IO.println("El numero excede con el numero de filas delimitada");
	}


}	