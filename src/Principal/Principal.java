package Principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double a, b;
		System.out.println("Ingrese el primer número:");
		a = scanner.nextDouble();
		System.out.println("Ingrese el segundo número:");
		b = scanner.nextDouble();

		Operación operacion = new Operación(a, b);

		int opcion;
		do {
			System.out.println("Elija una operación:");
			System.out.println("1. Suma");
			System.out.println("2. Resta");
			System.out.println("3. Multiplicación");
			System.out.println("4. División");
			System.out.println("5. Salir");
			opcion = scanner.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("Resultado: " + operacion.suma());
				break;
			case 2:
				System.out.println("Resultado: " + operacion.resta());
				break;
			case 3:
				System.out.println("Resultado: " + operacion.multiplicación());
				break;
			case 4:
				if (b == 0) {
					System.out.println("No se puede dividir entre cero.");
				} else {
					System.out.println("Resultado: " + operacion.division());
				}
				break;
			case 5:
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("Opción inválida.");
			}
		} while (opcion != 5);

		scanner.close();

	}

}
