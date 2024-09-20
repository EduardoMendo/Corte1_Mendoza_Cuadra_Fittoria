package org.efmb;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Clerk clerk = null;
        DeliveryPerson deliveryPerson = null;
        Salesperson salesperson = null;

        int option;
        do {
            System.out.println("\n--- Sistema de Gestión de Empleados ---");
            System.out.println("1. Agregar Oficinista");
            System.out.println("2. Mostrar Información del Oficinista");
            System.out.println("3. Agregar Repartidor");
            System.out.println("4. Mostrar Información del Repartidor");
            System.out.println("5. Agregar Comercial");
            System.out.println("6. Mostrar Información del Comercial");
            System.out.println("7. Salir");
            System.out.print("Ingrese una opción: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    // Crear y añadir un oficinista
                    break;
                case 2:
                    if (clerk != null) {
                        clerk.showEmployeeInfo();
                    } else {
                        System.out.println("No hay oficinista registrado.");
                    }
                    break;
                case 3:
                    // Crear y añadir un repartidor
                    break;
                case 4:
                    if (deliveryPerson != null) {
                        deliveryPerson.showEmployeeInfo();
                    } else {
                        System.out.println("No hay repartidor registrado.");
                    }
                    break;
                case 5:
                    // Crear y añadir un comercial
                    break;
                case 6:
                    if (salesperson != null) {
                        salesperson.showEmployeeInfo();
                    } else {
                        System.out.println("No hay comercial registrado.");
                    }
                    break;
                case 7:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, intente de nuevo.");
                    break;
            }
        } while (option != 7);

        scanner.close();
    }
}