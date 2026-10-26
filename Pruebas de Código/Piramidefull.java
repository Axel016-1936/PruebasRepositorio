void main ()
{
	
   int fila=0;
    IO.println("Dame un número de filas positivos enteros (no mayor a 20)");
	fila=Integer.parseInt(IO.readln());
    IO.println("Cantidad de filas:" + fila);
	if (fila>0 && fila<=20)
	{		
		/* Hacemos uso del mismo bucle de la pirmide invertida (denominada "piramide5")*/
		for (int i = 1; i<=fila; i++)
		{
		 for (int j = 1; j<=(fila-i); j++)
			{
			 IO.print(" ");
		    }
		  for(int k=1; k<=i; k++)
		  {  
			IO.print("*");
		  } 
		 /* Hacemos uso de una variable que ya cumplio su función, sea "k" la nueva variable que se usara en 
		 el nuevo ciclo  "for", de modo que la condición a cumplir es que "k" sea menor o igual a la variable "i"
		 menos 1, ya que matemáticamente (y estéticamente) al restar el valor de la cantidad que se designe 
		 para "k" mostrara una cantidad menor a la de la primera mitad, ejemplo:
		 sea "i" igual a 2, de modo que "k" sera la resta de "i" menos 1, imprimiendose en pantalla un
		 asterísco, y así sucesivamente con cada cantidad hasta la cantidad que designe la variable "fila".
		 */
		 for (int k=1; k<=(i-1); k++ )
		 {	
			IO.print("*");
		 }
	     /*Une las dos figuras en una sola por medio del "IO.print()" dentro de cada "for" que imprime 
		 astersico*/
	     IO.println();
		}	
	}
	else 
	{
		IO.println("El numero excede con el numero de filas delimitada");
	}
}	