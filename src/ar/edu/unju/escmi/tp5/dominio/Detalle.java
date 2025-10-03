package ar.edu.unju.escmi.tp5.dominio;

public class Detalle {
    private byte cantidad;
    private double precioUnitario;
    private int codigoproducto;
    private String descripcion;
    private int descuento;

    public Detalle() {
    }

    /*******/

    public Detalle(byte cantidad, double precioUnitario, int codigoproducto, String descripcion, int descuento) {
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.codigoproducto = codigoproducto;
        this.descripcion = descripcion;
        this.descuento = descuento;
    }

    /******/

    public byte getCantidad() {
        return cantidad;
    }

    public void setCantidad(byte cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getCodigoproducto() {
        return codigoproducto;
    }

    public void setCodigoproducto(int codigoproducto) {
        this.codigoproducto = codigoproducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

     public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    /*********/

    public double aplicarDescuento () {
        return (descuento * precioUnitario) / 100;
    }

    public double calcularImporteSinDescuento () {
        return cantidad * precioUnitario;
    }

    public double calcularImporteConDescuento () {
        return cantidad * aplicarDescuento();
    }

}