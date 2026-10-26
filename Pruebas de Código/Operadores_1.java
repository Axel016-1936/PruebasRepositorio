void main ()
{ 
		System.out.println( "----------Operadores Básicos en Java----------");
		
		//Operadores Aritmeticos: Ejecutan operaciones matematicas sobre variables
		
				System.out.println( "Jaime tiene 25 manzanas, pero necesita saber cuantas manzanas le sobrarian o quitarian si:");
						System.out.println( "a) Le dan 5 manzanas más");
								System.out.println( "b) Despues de darle dichas manzanas le quitan 10");
										System.out.println( "c) Le multiplican sus manzanas quitadas por 2");
												System.out.println( "d) Se divide esa cantidad entre 2.5");
														System.out.println( "f) Se busca que sea par o impar la ultima acción");


	int a=25+5;
		int b= a-10;
			int c=b*2;
				double d=c/2.5;
				
						System.out.println( "La suma de manzanas es igual a: " + a );
								System.out.println( "La resta de manzanas es igual a: " + b);
										System.out.println( "La multiplicación de manzanas es igual a: " + c);
												System.out.println( "La división de manzanas es equivalente a: " + d);
					if (d % 2 ==0)
					{ 		System.out.println( "Es par el número de manzanas"); }
					
					else
					{		System.out.println( "Es impar el numero de manzanas"); }


					System.out.println( "-----------Operadores de asignación-----------");
						
						double x= 13.5;
						x +=43.457;
								System.out.println( "Suma: "  + x);

						x -=5;
								System.out.println( "Resta: " + x);

						x *=5;
								System.out.println( "Multiplicación: " + x);

						x /=4;
								System.out.println( "Division: " +  x);

							
							//Operadores de Comparación y Lógicos
							
									System.out.println( "Un alumno del Politécnio quiere participar en el plan de intercambio internacional que el Poli organiza a Japon, ");
											System.out.println( "sin embargo, dicho progrma requiere del cumplimiento de ciertas condiciones, las cuales son: ");
											    System.out.println( "a) Promedio mayor o igual 9");
													System.out.println( "b) Dominio en el idioma del pais de interes o Ingles como minimo");
														System.out.println( "c) Tener una edad igual o mayor a diesiocho años");
																System.out.println( "d) Ser alumno regular y sin ninguna materia adeudada");
																	System.out.println( " e) A ver cursado más de dos semestres");

									double promedio=9.9;
									boolean idiomaJapones=false;								
									boolean idiomaIngles=true;
									int edad=20;
									boolean regular=true;
									boolean materiasadeudadas=false;
									int semetre=4;
									
									if (promedio >=9)
									{
										System.out.println( "El candidato cumple el primer requisito");
									}
									else
									{
										System.out.println( "El aspirante no cumple con el primer requisito");	
									}
	
									if (idiomaJapones || idiomaIngles)
									{ 
										System.out.println( "¿Es apto para comunicarse?: " + idiomaIngles);
									}
									else
									{
										System.out.println( "¿Es apto para comunicarse?: " + idiomaJapones);
									}	
										
									if (edad>=18)
									{
										System.out.println( "Puede viajar");
									}
									else
									{
										System.out.println( "No puede viajar");	
									}
									if ( regular || materiasadeudadas)
									{
										System.out.println( "¿Es regular?: " + regular);
										System.out.println("¿Debe alguna materia?: " + materiasadeudadas);
									}
									else
									{
										System.out.println( "¿Es regula?: " + !regular);
										System.out.println( "¿Debe alguna materia?: " + !materiasadeudadas);				
									}
									if (semetre>2)
									{
										System.out.println("Lleva más de un semestre inscrito");
									}
									else
									{
										System.out.println( "No tiene los semestres necesarios");	
									}









}