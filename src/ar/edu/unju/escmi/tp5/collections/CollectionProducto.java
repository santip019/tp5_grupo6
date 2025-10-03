package ar.edu.unju.escmi.tp5.collections;

import java.util.HashMap;
import java.util.Map;
import ar.edu.unju.escmi.tp5.dominio.Producto;

public class CollectionProducto {
    public static Map<Integer, Producto> productos = new HashMap<>();

    public static void guardarProducto(Producto producto) {
        productos.put(producto.getCodigoProducto(), producto);
    }

    public static Producto buscarProducto(int codigoProducto) {
        return productos.get(codigoProducto);
    }

    public static void precargarProducto() {
        productos.put(1001, new Producto(1001, "Fideos Knorr 500gr", 1200.0, 0, 5000));
        productos.put(1002, new Producto(1002, "Arroz Gallo Oro 1kg", 950.0, 25, 2000));
        productos.put(1003, new Producto(1003, "Aceite Cocinero 1.5lt", 3500.0, 30, 1500));
        productos.put(1004, new Producto(1004, "Yerba Taragui 1kg", 2100.0, 0, 3000));
        productos.put(1005, new Producto(1005, "Azúcar Ledesma 1kg", 1400.0, 0, 4000));
        productos.put(1006, new Producto(1006, "Celusal 1/2Kg", 600.0, 0, 6000));
        // El producto consta de: codigo, descripcion, precio, descuento, stock
    }
}
