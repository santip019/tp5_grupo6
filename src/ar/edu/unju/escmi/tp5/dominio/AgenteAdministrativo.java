package ar.edu.unju.escmi.tp5.dominio;

import java.util.List;
import java.util.Scanner;
import ar.edu.unju.escmi.tp5.collections.CollectionCliente;
import ar.edu.unju.escmi.tp5.collections.CollectionProducto;
import ar.edu.unju.escmi.tp5.collections.CollectionFactura;

public class AgenteAdministrativo extends Empleado {
    private static Scanner scanner = new Scanner(System.in);

    // Constructor por defecto
    public AgenteAdministrativo() {
    }

    // Constructor parametrizado
    public AgenteAdministrativo(int idEmpleado, String nombre, String apellido, int dni, String domicilio) {
        super(idEmpleado, nombre, apellido, dni, domicilio);
    }

    // Métodos
    // AltaProducto
    private Cliente identificarCliente() {
        System.out.print("Ingrese DNI del cliente: ");
        int dni = scanner.nextInt();
        return CollectionCliente.buscarCliente(dni);
    }

    public void realizarVenta() {
        System.out.println("=== REALIZAR VENTA ===");

        // Paso 1: Identificar cliente
        Cliente cliente = identificarCliente();
        if (cliente == null) {
            System.out.println("Cliente no encontrado. No se puede continuar con la venta.");
            return;
        }

        // Paso 2: Crear factura
        Factura factura = new Factura(cliente);

        boolean seguirComprando = true;
        while (seguirComprando) {
            // Paso 3: Selección de producto
            System.out.print("Ingrese el código del producto: ");
            int codigoProducto = scanner.nextInt();

            Producto producto = CollectionProducto.buscarProducto(codigoProducto);
            if (producto == null) {
                System.out.println("Producto no encontrado.");
                continue;
            }

            System.out.print("Ingrese la cantidad: ");
            int cantidad = scanner.nextInt();

            if (producto.getStock() < cantidad) {
                System.out.println("Stock insuficiente. Stock disponible: " + producto.getStock());
            } else {
                // Paso 4: Calcular precio según tipo de cliente
                double precioUnitario = producto.getPrecioUnitario();

                if (cliente instanceof ClienteMayorista) {
                    precioUnitario = precioUnitario / 2; // precio mayorista
                } else if (cliente instanceof ClienteMinorista) {
                    ClienteMinorista cm = (ClienteMinorista) cliente;// comentar y explicar casteo
                    if (cm.getObraSocial().equalsIgnoreCase("PAMI")) {
                        // aplica descuento del 10% sobre total luego
                        factura.setDescuentoMinorista(true);// cambiarlo a que use el metodo tieneDescuento de cliente
                                                            // minorista
                    }
                }

                // Crear detalle
                Detalle detalle = new Detalle(producto, cantidad);
                factura.agregarDetalle(detalle);

                // Actualizar stock
                producto.setStock(producto.getStock() - cantidad);

                System.out.println("Detalle agregado: " + detalle);
            }

            // Paso 5: Preguntar si sigue comprando
            System.out.print("¿Desea agregar otro producto? (s/n): ");
            String opcion = scanner.next();
            seguirComprando = opcion.equalsIgnoreCase("s");
        }

        // Paso 6: Guardar factura
        factura.calcularTotal();
        CollectionFactura.guardarFactura(factura);
        System.out.println("Factura generada exitosamente:\n" + factura);
    }

    @Override
    public String toString() {
        return "AgenteAdministrativo{" +
                "idEmpleado=" + idEmpleado +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni=" + dni +
                ", domicilio='" + domicilio + '\'' +
                '}';
    }
}
