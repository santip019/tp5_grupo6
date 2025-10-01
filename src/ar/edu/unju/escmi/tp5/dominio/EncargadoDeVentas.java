package ar.edu.unju.escmi.tp5.dominio;

public class EncargadoDeVentas extends Empleado {
    // Constructor por defecto
    public EncargadoDeVentas() {
    }

    // Constructor parametrizado
    public EncargadoDeVentas(int idEmpleado, String nombre, String apellido, int dni, String domicilio,
            String areaVentas,
            int numeroClientesAtendidos) {
        super(idEmpleado, nombre, apellido, dni, domicilio);

    }

    @Override
    public String toString() {
        return "EncargadoDeVentas{" +
                "idEmpleado=" + idEmpleado +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni=" + dni +
                ", domicilio='" + domicilio + '\'' +
                '}';
    }

    // Metodos del Encargado de Ventas
    // MostrarVentas
    // VerificarStock
    // MostrarTotal de Ventas
}
