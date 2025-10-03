package ar.edu.unju.escmi.tp5.collections;

import java.util.HashMap;
import java.util.Map;
import ar.edu.unju.escmi.tp5.dominio.Factura;

public class CollectionFactura {
    // La clave del map tiene que ser el numero de factura
    public static Map<Byte, Factura> facturas = new HashMap<>();

    public static void guardarFactura(Factura factura) {
        facturas.put(factura.getNumeroFactura(), factura);
    }

    public static Factura buscarFactura(byte numeroFactura) {
        return facturas.get(numeroFactura);
    }

}
