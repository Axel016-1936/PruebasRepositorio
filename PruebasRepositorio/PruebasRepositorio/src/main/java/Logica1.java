import java.util.Scanner;
public class Logica1 {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            System.out.print("Ingresa la suma total de tus calificaciones: ");
            int suma = entrada.nextInt();
            System.out.print("Ingresa el número de materias: ");
            int totalMaterias = entrada.nextInt();

            double resultado = calcularPromedio(suma, totalMaterias);
            System.out.println("Tu promedio real es: " + resultado);
        }

        public static double calcularPromedio(double sumaCalificaciones, int materias) {
            double promedio = sumaCalificaciones / materias;
            return promedio;
        }
    }

