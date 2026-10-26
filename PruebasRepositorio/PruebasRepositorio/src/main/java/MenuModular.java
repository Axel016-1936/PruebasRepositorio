import java.util.Scanner;

public class MenuModular {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENÚ DE EXAMEN ---");
            System.out.println("1. Mostrar saludo institucional");
            System.out.println("2. Calcular Factorial (NUEVO)");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = in.nextInt();

            if (opcion == 1) {
                imprimirSaludo(); // Llamada limpia al procedimiento
            } else if (opcion == 2) {
                System.out.print("Ingrese un número entero positivo: ");
                int numero = in.nextInt();

                // Como es una función que retorna un valor (long), guardamos el resultado o lo imprimimos directo
                long resultado = calcularFactorial(numero);
                System.out.println("El factorial de " + numero + " es: " + resultado);
            }

        } while (opcion != 3);
    } // Aquí cierra el main de forma limpia

    // PROCEDIMIENTO ORIGINAL (Opción 1)
    public static void imprimirSaludo() {
        System.out.println("¡Por la Patria Ciencia y Trabajo! ¡Goya!");
    }

    // TU NUEVA FUNCIÓN (Opción 2)
    public static long calcularFactorial(int factorial) {
        long acumulador = 1; // Empezamos en 1 porque si multiplicas por 0, todo da cero

        // Un solo ciclo 'for' que vaya desde 1 hasta el número que ingresó el usuario
        for (int i = 1; i <= factorial; i++) {
            acumulador = acumulador * i; // Vamos multiplicando y acumulando el resultado
        }

        return acumulador; // Regresamos el cálculo total al main
    }
}
