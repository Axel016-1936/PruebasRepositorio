import java.util.Scanner;
public class DerechoaExamen {
    public static void main(String[] args) {
        Scanner asistencia = new Scanner(System.in);
        int practicas = 0;
        double calificacion = 0;
        System.out.println("Bienvenidos alumnos, si quieren presentar examen, deberan presentarme los siguientes datos");
        System.out.println("Ingrese el número de clases a las que haya asistido, recuerde que solo tuvimos 9 clases");
        practicas = asistencia.nextInt();
        double suma = 0;
        if (practicas >= 1 && practicas <= 9) {
            for (int A = 1; A <= practicas; A++) {
                System.out.println("Ingrese su calificación de la práctica " + A + ": ");
                calificacion = asistencia.nextDouble();
                suma += calificacion;
            }
            System.out.println("Resultado: " + promedio(suma, practicas));

        } else {
            System.out.println("Número de clases no válido (debe ser entre 1 y 9).");
        }

    }

    public static String promedio(double suma, int practicas) {
        double promedios = suma / practicas;
        System.out.println("Su promedio general es: " + promedios);
        if (promedios >= 6) {
            return "Derecho a examen";
        } else {
            return "Sin Derecho a examen";
        }
    }
}
