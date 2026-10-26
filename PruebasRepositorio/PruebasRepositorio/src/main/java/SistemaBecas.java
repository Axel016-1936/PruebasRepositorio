import java.util.Scanner;
public class SistemaBecas
{
    public static void main (String[] args)
    {
            Scanner sc = new Scanner(System.in);
            double suma = 0;
                for (int i = 1; i <= 5; i++)
                {


                        System.out.println("Nota de la materia " + i + ": ");
                        suma += sc.nextDouble();
                }
        double prom = suma / 5;
                if (prom<=10 && prom >=0)
                {
                    System.out.println("Promedio obtenido: " + prom);
                    System.out.println("¿Aplica para la beca?: " + evaluarbecas(prom));
                }
                else
                {
                    System.out.println("Ingrese datos reales");
                }

    }
    public static boolean evaluarbecas(double prom)
    {
        if (prom>=9)
        {

            return true;
        }
        else
        {
            return false;
        }

    }

}
