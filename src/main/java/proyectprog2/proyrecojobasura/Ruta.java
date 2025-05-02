package proyectprog2.proyrecojobasura;

import java.util.ArrayList;
import java.util.List;

public class Ruta {
    private String idRuta;
    private List<Zona> zonas;
    private List<String> tiempos;

    public Ruta() {
        this.idRuta = "RUT001";
        this.zonas = new ArrayList<>();
        this.tiempos = new ArrayList<>();
        
        // Agregar algunas zonas de ejemplo
        this.zonas.add(new Zona("Ingenio", "Residencial"));
        this.zonas.add(new Zona("Centro", "Comercial"));
        
        // Agregar tiempos de ejemplo
        this.tiempos.add("08:00");
        this.tiempos.add("10:00");
    }

    public Ruta(String idRuta, List<Zona> zonas, List<String> tiempos) {
        this.idRuta = idRuta;
        this.zonas = zonas;
        this.tiempos = tiempos;
    }

    public void mostrarRuta() {
        for (int i = 0; i < zonas.size(); i++) {
            System.out.println(zonas.get(i).getNombreZona() + " - Tiempo: " + tiempos.get(i));
        }
    }

    // Getters y Setters
    public String getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(String idRuta) {
        this.idRuta = idRuta;
    }

    public List<Zona> getZonas() {
        return zonas;
    }

    public void setZonas(List<Zona> zonas) {
        this.zonas = zonas;
    }

    public List<String> getTiempos() {
        return tiempos;
    }

    public void setTiempos(List<String> tiempos) {
        this.tiempos = tiempos;
    }
} 