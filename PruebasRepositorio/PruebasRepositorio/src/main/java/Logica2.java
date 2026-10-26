import java.util.Scanner;
public class Logica2
{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número a evaluar: ");
        int numero = teclado.nextInt();

        if (esPrimo(numero)) {
            System.out.println("El número es PRIMO.");
        } else {
            System.out.println("El número NO es primo.");
        }
    }


    public static boolean esPrimo(int num) {
        if (num <= 1) return false;
        {
            boolean bandera = true;
            for (int i = 2; i <num; i++)
            {
                if (num % i == 0)
                {
                    bandera = false;
                    break;
                }
                else
                {
                    bandera = true;
                }
            }
            return bandera;
        }
    }
}
