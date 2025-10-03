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
    public void mostrarVentas() {
        System.out.println("Listado de ventas:");
        for (Factura factura : CollectionFactura.getFacturas().values()) {
            System.out.println("**************  Factura N° " + factura.getNumeroFactura() + " ******************");
            System.out.println("Cliente: " + factura.getDni());
            System.out.println("Fecha: " + factura.getFecha());

            for (Detalle d : factura.getDetalles()) {
                System.out.println("Producto: " + d.getDescripcion() +
                        " | Cantidad: " + d.getCantidad() +
                        " | Importe: $" + d.calcularImporteConDescuento());
            }

            System.out.println("Total: $" + factura.calcularTotal());
            System.out.println("---------------------------------");
        }
    }

    // MostrarTotalVentas
    public void mostrarTotalVentas() {
        double totalV = 0;

        for (Factura factura : CollectionFactura.getFacturas().values()) {
            totalV += factura.calcularTotal();
        }

        System.out.println("***********************");
        System.out.println("La suma total de todas las ventas es: $" + totalV);
        System.out.println("***********************");
    }

    // VerificarStock
    public void verificarStock() {
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
    
    public boolean actualizarStock(int codigoProducto, int cantidad) {
        Producto p = CollectionProducto.buscarProducto(codigoProducto);
        if (p == null) {
            System.out.println("Producto con código " + codigoProducto + " no encontrado.");
            return false;
        }
        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser mayor a 0.");
            return false;
        }
        if (p.getStock() >= cantidad) {
            p.setStock(p.getStock() - cantidad);
            System.out.println("Stock actualizado. Nuevo stock: " + p.getStock());
            return true;
        } else {
            System.out.println("Stock insuficiente. Disponible: " + p.getStock());
            return false;
        }
    }

}
