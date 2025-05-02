package proyectprog2.proyrecojobasura;

public class Zona {
    private String nombreZona;
    private String tipo;

    public Zona() {
        this.nombreZona = "Ingenio";
        this.tipo = "Residencial";
    }

    public Zona(String nombreZona, String tipo) {
        this.nombreZona = nombreZona;
        this.tipo = tipo;
    }

    public String getNombreZona() {
        return nombreZona;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNombreZona(String nombreZona) {
        this.nombreZona = nombreZona;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
} 