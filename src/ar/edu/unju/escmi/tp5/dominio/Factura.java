package ar.edu.unju.escmi.tp5.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Factura {
    private byte numeroFactura;
    private int dni;
    private LocalDate fecha;
    private List<Detalle> detalles = new ArrayList<>();
    private static byte contador = 1;

    public Factura() {

    }

    public Factura(byte numeroFactura, int dni, LocalDate fecha) {
        this.numeroFactura = contador++;
        this.dni = dni;
        this.fecha = fecha;
    }


    public byte getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(byte numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
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
            total += d.calcularImporteConDescuento();
        }
        return total;
    }

    public void mostrarFactura() {
        for (Detalle d : detalles) {
            System.out.println("Producto: " + d.getDescripcion() +
                               " Cantidad: " + d.getCantidad() +
                               " Importe: " + d.calcularImporteConDescuento());
        }
        System.out.println("Total: " + calcularTotal());
    }
}

