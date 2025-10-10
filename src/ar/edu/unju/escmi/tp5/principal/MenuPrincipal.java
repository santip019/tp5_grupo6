package ar.edu.unju.escmi.tp5.principal;

import java.util.Scanner;

import ar.edu.unju.escmi.tp5.dominio.EncargadoDeVentas;
import ar.edu.unju.escmi.tp5.dominio.Cliente;

public class MenuPrincipal {

    static void menuCliente() {
        Scanner sc = new Scanner(System.in);
        byte op;
        do {
            System.out.println("Menu de Clientes.");
            System.out.println("1 - Buscar Factura");
            System.out.println("2 - Salir");
            System.out.print("Ingrese una opcion: ");
            op = sc.nextByte();
            sc.nextLine(); // Para limpiar el buffer del scanner

            switch (op) {
                case 1:
                    System.out.println("Buscar Factura");
                    System.out.print("Ingrese el numero de factura a buscar: ");
                    byte numeroFactura = sc.nextByte();
                    sc.nextLine(); // Para limpiar el buffer del scanner
                    Cliente.buscarFactura(numeroFactura);
                    break;
                case 2:
                    System.out.println("Saliendo del Menu de Clientes...");
                    break;
                default:
                    System.out.println("Opcion incorrecta. Intente nuevamente.");
            }
        } while (op != 2);

        sc.close();
    }

    static void menuEmpleado() {
        Scanner sc = new Scanner(System.in);
        byte op;
        byte op2;
        byte op3;
        do {
            System.out.println("Menu de Empleados.");
            System.out.println("1 - Menu Encargado de Ventas");
            System.out.println("2 - Menu Agente Administrativo");
            System.out.println("3 - Salir");
            System.out.print("Ingrese una opcion: ");
            op = sc.nextByte();
            sc.nextLine(); // Para limpiar el buffer del scanner

            switch (op) {
                case 1:
                    System.out.println("Menu Encargado de Ventas");
                    do {
                        System.out.println("1 - Mostrar Ventas");
                        System.out.println("2 - Verificar Stock");
                        System.out.println("3 - Mostrar Total de ventas");
                        System.out.println("4 - Salir");
                        System.out.print("Ingrese una opcion: ");
                        op2 = sc.nextByte();
                        sc.nextLine(); // Para limpiar el buffer del scanner

                        switch (op2) {
                            case 1:
                                System.out.println("Mostrar ventas");
                                EncargadoDeVentas.mostrarVentas();
                                break;
                            case 2:
                                System.out.println("Verificar Stock");
                                System.out.print("Ingrese el código del producto: ");
                                int codigoProducto = sc.nextInt();
                                EncargadoDeVentas.verificarStock(codigoProducto); // Pasa el código como argumento
                                sc.nextLine(); // Limpiar el buffer
                                break;
                            case 3:
                                System.out.println("Mostrar Total de ventas");
                                EncargadoDeVentas.mostrarTotalVentas();
                                break;
                            case 4:
                                System.out.println("Saliendo del Menu Encargado de Ventas...");
                                break;
                            default:
                                System.out.println("Opcion incorrecta. Intente nuevamente.");
                        }
                    } while (op2 != 4);
                    break;

                case 2:
                    System.out.println("Menu Agente Administrativo");
                    do {
                        System.out.println("1 - Dar Alta de Producto");
                        System.out.println("2 - Identificar Clientes");
                        System.out.println("3 - Realizar Venta");
                        System.out.println("4 - Salir");
                        System.out.print("Ingrese una opcion: ");
                        op3 = sc.nextByte();
                        sc.nextLine(); // Para limpiar el buffer del scanner

                        switch (op3) {
                            case 1:
                                System.out.println("Dar Alta de Producto");
                                break;
                            case 2:
                                System.out.println("Identificar Clientes");
                                break;
                            case 3:
                                System.out.println("Realizar Venta");
                                break;
                            case 4:
                                System.out.println("Saliendo del Menu Agente Administrativo...");
                                break;
                            default:
                                System.out.println("Opcion incorrecta. Intente nuevamente.");
                        }
                    } while (op3 != 4);
                    break;
                case 3:
                    System.out.println("Saliendo del Menu de Empleados...");
                    break;
                default:
                    System.out.println("Opcion incorrecta. Intente nuevamente.");
            }
        } while (op != 3);

        sc.close();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte op;

        do {

            System.out.println("\n **** Menu de Opciones ****");
            System.out.println("1 - Menu de Clientes");
            System.out.println("2 - Menu de Empleados");
            System.out.println("3 - Salir");
            System.out.print("Ingrese una opcion: ");
            op = sc.nextByte();
            sc.nextLine(); // Para limpiar el buffer del scanner

            switch (op) {
                case 1:
                    menuCliente(); // Llama al menu de clientes
                    break;
                case 2:
                    menuEmpleado(); // Llama al menu de empleados
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion incorrecta. Intente nuevamente.");
            }

        } while (op != 3);

        sc.close();
    }
}
