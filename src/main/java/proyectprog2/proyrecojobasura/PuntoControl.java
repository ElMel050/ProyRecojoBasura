package proyectprog2.proyrecojobasura;

public class PuntoControl {
    private String idPunto;
    private String zona;
    private boolean completado;

    public PuntoControl() {
        this.idPunto = "PCT001";
        this.zona = "Ingenio";
        this.completado = false;
    }

    public PuntoControl(String idPunto, String zona) {
        this.idPunto = idPunto;
        this.zona = zona;
        this.completado = false;
    }

    public void marcarCompletado() {
        completado = true;
    }

    public String getZona() {
        return zona;
    }

    public boolean isCompletado() {
        return completado;
    }

    // Getters y Setters adicionales
    public String getIdPunto() {
        return idPunto;
    }

    public void setIdPunto(String idPunto) {
        this.idPunto = idPunto;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public void setCompletado(boolean completado) {
        this.completado = completado;
    }
} 