package pureba.programacion;

import java.util.Scanner;

public class MainBancoPichincha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Scanner tecladoString = new Scanner(System.in);

		int opcion;
		String clave = "85DB";
		int numero;
		String clave2;
		boolean resultado;

		do {
			System.out.println("Ingrese Clave");
			clave2 = tecladoString.nextLine();
			resultado = clave2.equals(clave);
			if (resultado == true) {
				do {
					System.out.println("BANCO PICHINCHA, elija una opción: ");
					System.out.println("1. Consultar pagos");
					System.out.println("2. Realizar transferencia");
					System.out.println("3. SALIR");
					opcion = teclado.nextInt();

					if (opcion == 1) {
						System.out.println("No tiene ningún pendiente");
						System.out.println();
					}

					if (opcion == 2) {
						System.out.println("Ingrese la cuenta de destino de la transferencia");
						String cuenta = tecladoString.nextLine();
						System.out.println("Ingrese monto a transferir");
						int monto = teclado.nextInt();
						int saldo = 2500 - monto;
						System.out.println("Su saldo es: " + "$" + saldo);
						System.out.println();
					}

				} while (opcion != 3);

			} else {
				System.out.println("Contraseña incorrecta");
			}
		} while (resultado == false);
		
		System.out.println("Gracias por preferirnos");

	}

}
