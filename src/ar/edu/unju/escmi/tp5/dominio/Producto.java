package ar.edu.unju.escmi.tp5.dominio;

public class Producto {
    private int codigoProducto;
    private String descripcion;
    private double precio;
    private int stock;
    private double descuento;

    // Constructor por defecto
    public Producto() {
        this.codigoProducto = 0;
        this.descripcion = "";
        this.precio = 0.0;
        this.stock = 0;
        this.descuento = 0.0;
    }

    // Constructor parametrizado
    public Producto(int codigoProducto, String descripcion, double precio, int stock, double descuento) {
        this.codigoProducto = codigoProducto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.descuento = descuento;
    }

    // Setters para modificar los atributos
    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;

    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    // Getters para obtener los valores de los atributos
    public int getCodigoProducto() {
        return codigoProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public double getDescuento() {
        return descuento;
    }

    // Metodos
    // ActualizarStock
}

// Atributos
// codigoProducto int;
// descripcion String;
// precio double;
// stock int;
// descuento double;
