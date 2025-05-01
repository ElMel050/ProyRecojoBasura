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
    private double id_contenedor;
    private String ubicacion;
    private int capacidad;
    //private nivel-actual;

    public double getId_contenedor() {
        return id_contenedor;
    }

    public void setId_contenedor(double id_contenedor) {
        this.id_contenedor = id_contenedor;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    
    //
    public Contenedor() {
    }

    public Contenedor(double id_contenedor, String ubicacion, int capacidad) {
        this.id_contenedor = id_contenedor;
        this.ubicacion = ubicacion;
        this.capacidad = capacidad;
    }
    //
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
