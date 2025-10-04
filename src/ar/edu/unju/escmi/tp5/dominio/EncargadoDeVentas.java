package ar.edu.unju.escmi.tp5.dominio;

import java.util.Scanner;

import ar.edu.unju.escmi.tp5.collections.CollectionFactura;
import ar.edu.unju.escmi.tp5.collections.CollectionProducto;

public class EncargadoDeVentas extends Empleado {

    // Constructor por defecto
    public EncargadoDeVentas() {
    }

    // Constructor parametrizado
    public EncargadoDeVentas(int idEmpleado, String nombre, String apellido, int dni, String domicilio) {
        super(idEmpleado, nombre, apellido, dni, domicilio);

    }

    @Override
    public String toString() {
        return "EncargadoDeVentas{" +
                "idEmpleado=" + idEmpleado +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni=" + dni +
                ", domicilio='" + domicilio + '\'' +
                '}';
    }

    // MostrarVentas
    public void mostrarVentas() { // Muestra todas las facturas registradas
        System.out.println("Listado de ventas:");
        for (Factura factura : CollectionFactura.getFacturas().values()) { // Recorre todas las facturas en la colección
            System.out.println("**************  Factura N° " + factura.getNumeroFactura() + " ******************");
            System.out.println("Cliente: " + factura.getDni());
            System.out.println("Fecha: " + factura.getFecha());

            // Llamamos al método mostrarFactura() de cada factura
            factura.mostrarFactura();

            System.out.println("**************************************");
        }
    }

    // MostrarTotalVentas
    public void mostrarTotalVentas() { // Muestra la suma total de todas las ventas
        double totalV = 0;

        for (Factura factura : CollectionFactura.getFacturas().values()) { // Recorre todas las facturas en la colección
            totalV += factura.calcularTotal();
        }

        System.out.println("***********************");
        System.out.println("La suma total de todas las ventas es: $" + totalV);
        System.out.println("***********************");
    }

    // VerificarStock
    public void verificarStock() { // Verifica el stock de un producto por su código
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el código del producto: ");
        int codigo = sc.nextInt();// Lee el código del producto

        Producto producto = CollectionProducto.buscarProducto(codigo);// Busca el producto en la colección

        if (producto != null) {// Si el producto existe
            System.out.println("Producto encontrado: " + producto.getDescripcion());
            if (producto.getStock() > 0) {// Si hay stock
                System.out.println("El producto está en stock (" + producto.getStock() + " unidades).");
            } else {// Si no hay stock
                System.out.println("El producto no tiene stock.");
            }
        } else {// Si el producto no existe
            System.out.println("No existe un producto con ese código.");
        }

        sc.close();
    }

}