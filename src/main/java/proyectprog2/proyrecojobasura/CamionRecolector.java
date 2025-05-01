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
    private double id_camion;
    //private Ruta ruta_asignada;
    private String horario;
    //

    public double getId_camion() {
        return id_camion;
    }

    public void setId_camion(double id_camion) {
        this.id_camion = id_camion;
    }

//    public Ruta getRuta_asignada() {
//        return ruta_asignada;
//    }
//
//    public void setRuta_asignada(Ruta ruta_asignada) {
//        this.ruta_asignada = ruta_asignada;
//    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    ////
    ///
    public CamionRecolector(double id_camion, String horario) {
        this.id_camion = id_camion;
        //this.ruta_asignada=new Ruta();
        this.horario = horario;
    }
    public CamionRecolector(){
        id_camion = 12.2;
        //ruta_asignada=new Ruta("",2,"");
        horario = "mañana";
    }
    
    //
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
