package ar.edu.unju.escmi.tp5.dominio;

import ar.edu.unju.escmi.tp5.collections.CollectionProducto;

public class Producto {
    private int codigoProducto;
    private String descripcion;
    private double precio;
    private int stock;
    private double descuento;

    // Constructor por defecto
    public Producto() {
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
    
    // Cantidad es pasado como parametro
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

// Atributos
// codigoProducto int;
// descripcion String;
// precio double;
// stock int;
// descuento double;
