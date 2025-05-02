/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectprog2.proyrecojobasura;

/**
 *
 * @author Lenovo
 */
public class Contenedor {
    private String idContenedor;
    private Zona zonaUbicacion;
    private double capacidadMax;
    private double pesoActual;
    private Sensor sensor;

    public Contenedor() {
        this.idContenedor = "CONT001";
        this.zonaUbicacion = new Zona();
        this.capacidadMax = 1000.0;
        this.pesoActual = 0.0;
        this.sensor = new SensorCarga("SensoTech", "SEN001", 1000.0);
    }

    public Contenedor(String idContenedor, Zona zonaUbicacion, double capacidadMax, Sensor sensor) {
        this.idContenedor = idContenedor;
        this.zonaUbicacion = zonaUbicacion;
        this.capacidadMax = capacidadMax;
        this.pesoActual = 0;
        this.sensor = sensor;
    }


    // Getters y Setters
    public String getIdContenedor() {
        return idContenedor;
    }

    public void setIdContenedor(String idContenedor) {
        this.idContenedor = idContenedor;
    }

    public Zona getZonaUbicacion() {
        return zonaUbicacion;
    }

    public void setZonaUbicacion(Zona zonaUbicacion) {
        this.zonaUbicacion = zonaUbicacion;
    }

    public double getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(double capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    public double getPesoActual() {
        return pesoActual;
    }

    public void setPesoActual(double pesoActual) {
        this.pesoActual = pesoActual;
    }

    public Sensor getSensor() {
        return sensor;
    }

    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }
    //
    public void agregarBasura(double peso) {
        this.pesoActual += peso;
    }
    public boolean estaLleno() {
        return sensor.detectarEstadoContenedor();
    }

    public void leer(){
        System.out.println("ingrese datos del contenedor");
        //id_contenedor = lec.nextDouble();
        //ubicacion = lec.nextLine();
        //capacidad = lec.nextInt();
    }
    public void mostrar(){
        System.out.println("mostrar contenedor");//
    }
    
}
