package ar.edu.unju.escmi.tp5.dominio;

public class ClienteMinorista extends Cliente {
    private String obraSocial;

    public ClienteMinorista() {
        // Constructor vacio
    }

    // Constructor parametrizado(con los atributos de la superclase)
    public ClienteMinorista(int dni, String nombre, String domicilio, String obraSocial) {
        super(dni, nombre, domicilio);
        this.obraSocial = obraSocial;
    }

    public String getObraSocial() { 
        return obraSocial; 
    }
    public void setObraSocial(String obraSocial) { 
        this.obraSocial = obraSocial; 
    }

    @Override
    public String toString() {
        return "ClienteMinorista{" +
                "dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", domicilio='" + domicilio + '\'' +
                ", obraSocial='" + obraSocial + '\'' +
                '}';
    }

}
