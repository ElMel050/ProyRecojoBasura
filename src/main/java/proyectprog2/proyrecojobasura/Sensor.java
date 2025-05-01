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
    private String marca;
    private double id_sensor;
    private Contenedor contenedor;
    //

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getId_sensor() {
        return id_sensor;
    }

    public void setId_sensor(double id_sensor) {
        this.id_sensor = id_sensor;
    }

    public Contenedor getContenedor() {
        return contenedor;
    }

    public void setContenedor(Contenedor contenedor) {
        this.contenedor = contenedor;
    }
    //

    public Sensor() {
    }

    public Sensor(String marca, double id_sensor, Contenedor contenedor) {
        this.marca = marca;
        this.id_sensor = id_sensor;
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
