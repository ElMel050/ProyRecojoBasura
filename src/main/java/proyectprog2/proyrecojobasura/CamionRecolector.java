/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectprog2.proyrecojobasura;

/**
 *
 * @author Lenovo
 */
public class CamionRecolector {
    private String idCamion;
    private double cargaMaxima;
    private String horarioRecojo;
    private Ruta ruta;
    private SensorCarga sensorCarga;

    public CamionRecolector() {
        this.idCamion = "CAM001";
        this.cargaMaxima = 5000.0;
        this.horarioRecojo = "Mañana";
        this.ruta = new Ruta();
        this.sensorCarga = new SensorCarga("SensoTech", "SEN001", 5000.0);
    }

    public CamionRecolector(String idCamion, double cargaMaxima, String horarioRecojo, Ruta ruta, SensorCarga sensorCarga) {
        this.idCamion = idCamion;
        this.cargaMaxima = cargaMaxima;
        this.horarioRecojo = horarioRecojo;
        this.ruta = ruta;
        this.sensorCarga = sensorCarga;
    }

    public boolean estaLleno() {
        return sensorCarga.detectarEstadoContenedor();
    }

    public void mostrarRuta() {
        ruta.mostrarRuta();
    }

    // Getters y Setters
    public String getIdCamion() {
        return idCamion;
    }

    public void setIdCamion(String idCamion) {
        this.idCamion = idCamion;
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public String getHorarioRecojo() {
        return horarioRecojo;
    }

    public void setHorarioRecojo(String horarioRecojo) {
        this.horarioRecojo = horarioRecojo;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }

    public SensorCarga getSensorCarga() {
        return sensorCarga;
    }

    public void setSensorCarga(SensorCarga sensorCarga) {
        this.sensorCarga = sensorCarga;
    }

    public void leer(){
        System.out.println("ingrese datos del camion");
        //id_camion = lec.nextDouble();
        //horario = lec.nextLine();
        //ruta_asignada.leer();
    }
    public void mostrar(){
        System.out.println("mostrar");
        //ruta_asignada.mostrar(); 
    }
    
    
}
