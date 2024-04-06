import java.util.Scanner;
// CODIGO HECHO POR MI
public class Main {

    public static void mostrarMenu() {
        System.out.println("""
                    *** Escriba el número de la opción deseada ***
                    1 - Consultar saldo
                    2 - Retirar
                    3 - Depositar
                    9 - Salir
                """);
    }
    public static void main(String[] args) {
        System.out.println("Desafio de Alura: Aplicacion bancaria");
        Scanner teclado = new Scanner(System.in);
        double saldo = 1599.99;

        System.out.println("Cual es tu nombre?");
        String client = teclado.nextLine();
        System.out.println("***********************************************");
        System.out.println("\n  Bienvenido(a) " + client);
        System.out.println("    Tipo de cuenta: Corriente");
        System.out.println("    Saldo Disponible: $" + saldo);
        System.out.println("\n***********************************************");


        mostrarMenu();
        int opcion = teclado.nextInt();

        for (int i = 0; i < 100; i++) {
            if (opcion == 1) {
                System.out.println("Su saldo es de: $" + saldo);
                mostrarMenu();
                opcion = teclado.nextInt();
            }
            if (opcion == 2) {
                System.out.println("Cuanto saldo quieres retirar?");
                double retirar = teclado.nextDouble();
                saldo = saldo - retirar;
                if (retirar < saldo){
                    System.out.println("Retiro $" + retirar + ". Su saldo actual es: " + saldo);
                    mostrarMenu();
                    opcion = teclado.nextInt();

                }else if(retirar > saldo){
                    System.out.println("Saldo insuficiente");
                    mostrarMenu();
                    opcion = teclado.nextInt();
                }

            }
            if (opcion == 3){
                System.out.println("Cuanto valor vas a depositar?");
                System.out.println("Tienes: " + saldo);
                double depositar = teclado.nextDouble();
                saldo = saldo + depositar;
                System.out.println("Su saldo actual es: " + saldo);
                mostrarMenu();
                opcion = teclado.nextInt();

            }
            if (opcion == 9){
                System.out.println("Finalizando el programa. Muchas gracias por utilizar nuestros servicios!");
                break;
            }
        }
    }


}
