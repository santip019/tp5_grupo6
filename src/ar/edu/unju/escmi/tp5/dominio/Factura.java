package ar.edu.unju.escmi.tp5.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Factura {
    private LocalDate fecha;
    private Cliente cliente;
    private List<Detalle> detalles = new ArrayList<>();

    private static int contador = 1;
    private static int numeroFactura = contador++;

    public Factura() {

    }

    public Factura(LocalDate fecha) {
        this.fecha = fecha;
    }


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public static int getNumeroFactura() {
        return numeroFactura;
    }

    public static void setNumeroFactura(int numeroFactura) {
        Factura.numeroFactura = numeroFactura;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public List<Detalle> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<Detalle> detalles) {
        this.detalles = detalles;
    }

    public void agregarDetalle(Detalle detalle) {
        detalles.add(detalle);
    }

    public double calcularTotal() {
        double total = 0;
        for (Detalle d : detalles) {
            total += d.calcularImporte();
        }
        return total;
    }

    public void mostrarFactura() {
        System.out.println("----- FACTURA -----");
        System.out.println("N°: " + numeroFactura);
        System.out.println("Fecha: " + fecha);
        System.out.println("Cliente: " + cliente.nombre);
        System.out.println("DNI: " + cliente.dni);
        System.out.println("Dirección: " + cliente.domicilio);
        System.out.println("-------------------");
        System.out.println("DETALLE:");
        for (Detalle d : detalles) {
            System.out.println("Cantidad: " + d.getCantidad() + "\t" +
                    "Descripción: " + d.getProducto().getDescripcion() + "\t" +
                    "Precio Unitario: " + d.getProducto().getPrecio() + "\t");
        }
        System.out.println("-------------------");
        System.out.println("TOTAL: " + calcularTotal());
    }
}
