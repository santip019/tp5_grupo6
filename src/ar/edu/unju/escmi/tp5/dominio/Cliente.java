package ar.edu.unju.escmi.tp5.dominio;

import ar.edu.unju.escmi.tp5.collections.CollectionFactura;

public class Cliente {
    // Atributos protegidos
    protected int dni;
    protected String nombre;
    protected String domicilio;

    public Cliente() {
        // Constructor vacio
    }

    // Constructor parametrizado
    public Cliente(int dni, String nombre, String domicilio) {
        this.dni = dni;
        this.nombre = nombre;
        this.domicilio = domicilio;
    }

    // Getters y Setters
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    // Método para buscar factura
    public static void buscarFactura(byte numeroFactura) {
        Factura factura = CollectionFactura.buscarFactura(numeroFactura);
        if (factura != null) {
            System.out.println("Factura encontrada: ");
            factura.mostrarFactura();
        } else {
            System.out.println("No se encontró la factura con número: " + numeroFactura);
        }
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", domicilio='" + domicilio + '\'' +
                '}';
    }

}
