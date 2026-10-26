void main ()
{
	/* Se designa con un "if" el numero de filas permitidas para controlar la cantidad real de filas,
	 para que el codigo no llegue a una cantidad inmensa y se vea afectado en un bucle indefinido e infinito
	*/
	int fila=0;
    IO.println("Dame un número de filas positivos enteros (no mayor a 20)");
	fila=Integer.parseInt(IO.readln());
    IO.println("Cantidad de filas:" + fila);
	if (fila>0 && fila<=20) {
		/* "int i" representa el número de fílas que tiene en total al designar la variable,
	 de modo que se parte de 1 para que matematicamente se imprima el número de caracteres
	 correspondientes a la fila actual, cumpliendo con la condición booleana
		(i<=fila) entonces (¿1 es menor o igual a 5?), true, por lo que se imprime en pantalla 
		(despues del primer ciclo, se incrementa el valor de "i").
		*/	
	for (int i =0; i<=fila; i++)
	{
		/* Se imprime los asteriscos por columna, conforme a el ciclo anterior, este "for" anidado 
		 define la cantidad de columnas impresas, de modo que se imprima la misma cantidad de asteriscos
		 de la cantidad de la fila actual (es decir "i")
	    */
		for (int j = 1; j<=i; j++)
		{	
			IO.print("*");
		}
			/* Realiza un salto de linea entre filas (i). En terminos simples, es 
			 como una maquina de escribir al utilizar el torno para cambiar de línea,
			 de modo que el programa sigue abajo en el siguiente renglon.
			*/
	   IO.println();
	}
}
  else {
	 IO.println("No cumple con el número de filas positivos");
  }
}	