import java.util.Scanner;
public class Boletos
{
    public static void main(String[] args)
    {
        int opcion=0;
        while (opcion!=2)
        {
            System.out.println("==========Registro de compra de boleto========");
            System.out.println("Ingrese la ocpión para poder ingresar al sistema");
            System.out.println("1.-Compra de Boleto");
            System.out.println("2.- Finalizar el proceso");
            Scanner lector = new Scanner(System.in);
             opcion = lector.nextInt();
            switch (opcion)
            {

                case 1:
                    int evento = 0;
                    while (evento != 4) {
                        System.out.println("Ingrese su evento:");
                        System.out.println("1.-Clasico Universitario (IPN VS UNAM)");
                        System.out.println("2.-América VS Pumas (No vale la pena)");
                        System.out.println("3.- Rallados VS Tigres");
                        System.out.println("4.-Finalizar compra");
                        evento = lector.nextInt();
                        switch (evento) {
                            case 1: {
                                System.out.println("Evento: Clasico Universitaro");
                                System.out.println("Precio: $60");
                                int precio = 60;
                                System.out.println("Ingresa tu edad:");
                                int edad = lector.nextInt();
                                System.out.println("Ingresa tu equipo:");
                                System.out.println("1.- Burros Blancos");
                                System.out.println("2.- Pumas Universitarios");
                                int equipo = lector.nextInt();
                                switch (equipo) {
                                    case 1: {
                                        System.out.println("Tienes buenos gustos");
                                        if (edad > 18) {
                                            int precioP = precio;
                                            System.out.println("Precio: $60");
                                            System.out.println("Descuento:90%");
                                            double descuento = precioP * 0.9;
                                            System.out.println("Total a pagar: " + descuento);

                                        } else {
                                            System.out.println("Precio: $60");
                                            System.out.println("Descuento:100%");
                                            System.out.println("Total a pagar: Entrada gratis ");
                                        }
                                        break;
                                    }
                                    case 2: {
                                        System.out.println("Tienes pesimos gustos");
                                        int precioU = precio;
                                        System.out.println("Precio: $60");
                                        System.out.println("Descuento:Sin desucento, pagas el doble");
                                        double pago = precioU * 2;
                                        System.out.println("Total a pagar: " + pago);
                                        break;
                                    }

                                }
                                break;

                            }

                            case 2: {
                                System.out.println("Evento:América VS Pumas ");
                                System.out.println("Precio: $ 120");
                                int precio = 120;
                                System.out.println("Ingresa tu edad:");
                                int edad = lector.nextInt();
                                System.out.println("Ingresa tu equipo:");
                                System.out.println("1.- America");
                                System.out.println("2.- Pumas Universitarios");
                                int equipo = lector.nextInt();
                                switch (equipo) {
                                    case 1: {
                                        System.out.println("¿Eres Gay?, me das penita");
                                        if (edad > 18) {
                                            int precioA = precio;
                                            System.out.println("Precio: $120");
                                            System.out.println("Descuento:50%");
                                            double descuento = precioA * 0.5;
                                            System.out.println("Total a pagar: " + descuento);

                                        } else {
                                            System.out.println("Precio: $120");
                                            System.out.println("Descuento:100%");
                                            System.out.println("Total a pagar: Entrada gratis ");
                                        }
                                        break;
                                    }
                                    case 2: {
                                        System.out.println("Tienes pesimos gustos");
                                        int precioU = precio;
                                        System.out.println("Precio: $60");
                                        System.out.println("Descuento:Sin desucento, pagas el doble");
                                        double pago = precioU * 2;
                                        System.out.println("Total a pagar: " + pago);
                                        break;
                                    }

                                }
                                break;
                            }

                            case 3: {
                                System.out.println("Evento:Rallados VS Tigres ");
                                System.out.println("Precio: $70 ");
                                int precio = 70;
                                System.out.println("Ingresa tu edad:");
                                int edad = lector.nextInt();
                                System.out.println("Ingresa tu equipo:");
                                System.out.println("1.- Rallados");
                                System.out.println("2.- Tigres");
                                int equipo = lector.nextInt();
                                switch (equipo) {
                                    case 1: {
                                        System.out.println("Tienes buenos gustos");
                                        if (edad > 18) {
                                            int precioC = precio;
                                            System.out.println("Precio: $70");
                                            System.out.println("Descuento:90%");
                                            double descuento = precioC * 0.9;
                                            System.out.println("Total a pagar: " + descuento);

                                        } else {
                                            System.out.println("Precio: $60");
                                            System.out.println("Descuento:100%");
                                            System.out.println("Total a pagar: Entrada gratis ");
                                        }
                                        break;
                                    }
                                    case 2: {
                                        System.out.println("Tienes pesimos gustos");
                                        int precioT = precio;
                                        System.out.println("Precio: $70");
                                        System.out.println("Descuento:Sin desucento, pagas el doble");
                                        double pago = precioT * 2;
                                        System.out.println("Total a pagar: " + pago);
                                        break;
                                    }

                                }
                                break;
                            }
                            case 4: {
                                System.out.println("Fin, gracias por su compra");
                                break;
                            }
                            default: {
                                System.out.println("Opción no valida, ingrese un número del 1 al 4");
                                break;
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.println("Fin del sistema");
                    break;

                default:
                    System.out.println("No es una opción valida");

            }
        }

    }

}
