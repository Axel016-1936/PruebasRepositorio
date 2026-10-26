void main ()
{
	int x=0;
	int y=0;
	int z=0;
	IO.println("Escribe una tabla");
	x=Integer.parseInt(IO.readln());
    IO.println("Escribe hasta que numero quieres que se multiplique");
	y=Integer.parseInt(IO.readln());
	
	for (z=1;z<=y;z++)
	{
		int R=x*z;
		IO.println(z + "x" + x + "=" + R);
	}
		
}