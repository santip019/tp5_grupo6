package ar.edu.unju.escmi.tp5.dominio;

public class Detalle {
    private int cantidad;
    private Producto producto;

    public Detalle() {
    }

    public Detalle(Producto producto, int cantidad) {
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(byte cantidad) {
        this.cantidad = cantidad;
    }

    public double calcularImporte() {
        return cantidad * producto.getPrecio();
    }


}