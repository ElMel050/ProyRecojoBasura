/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectprog2.proyrecojobasura;

/**
 *
 * @author Lenovo
 */
public class Sensor {
    protected String marca;
    protected String idSensor;
    private Contenedor contenedor;
    //

    public Sensor() {
        this.marca = "SensoTech";
        this.idSensor = "SEN001";
        this.contenedor = new Contenedor();
    }

    public Sensor(String marca, String idSensor) {
        this.marca = marca;
        this.idSensor = idSensor;
    }

    public boolean detectarEstadoContenedor() {
        return false; // se redefine en subclases
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getIdSensor() {
        return idSensor;
    }

    public void setIdSensor(String idSensor) {
        this.idSensor = idSensor;
    }

    public Contenedor getContenedor() {
        return contenedor;
    }

    public void setContenedor(Contenedor contenedor) {
        this.contenedor = contenedor;
    }
    //

    public Sensor(String marca, double id_sensor, Contenedor contenedor) {
        this.marca = marca;
        this.idSensor = String.valueOf(id_sensor);
        this.contenedor = contenedor;
    }
    
    //
    public void leer(){
        System.out.println("ingrese datos del sensor");
        //marca = lec.nextDouble();
        //id_sensor = lec.nextLine();
        //contenedor.leer();
    }
    public void mostrar(){
        System.out.println("mostrar");
        //contenedor.mostrar(); 
    }
    
}
