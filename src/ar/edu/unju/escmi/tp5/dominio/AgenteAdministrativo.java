package ar.edu.unju.escmi.tp5.dominio;

import java.util.List;

public class AgenteAdministrativo extends Empleado {
    // Constructor por defecto
    public AgenteAdministrativo() {
        super();
    }

    // Constructor parametrizado
    public AgenteAdministrativo(int idEmpleado, String nombre, String apellido, int dni, String domicilio,
            String areaAdministrativa, List<String> tareas) {
        super(idEmpleado, nombre, apellido, dni, domicilio);
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

    // Métodos
    // AltaProducto
    // IdentificarCliente
    // realizarventa
}
