package proyectprog2.proyrecojobasura;

import java.util.ArrayList;
import java.util.List;

public class EmpresaLPL {
    private List<Empleado> empleados;
    private List<CamionRecolector> camiones;
    private List<Contenedor> contenedores;
    private List<Ruta> rutas;

    public EmpresaLPL() {
        this.empleados = new ArrayList<>();
        this.camiones = new ArrayList<>();
        this.contenedores = new ArrayList<>();
        this.rutas = new ArrayList<>();

        // Agregar datos de ejemplo
        this.empleados.add(new Empleado());
        this.camiones.add(new CamionRecolector());
        this.contenedores.add(new Contenedor());
        this.rutas.add(new Ruta());
    }

    public void adicionarEmpleado(Empleado e) {
        empleados.add(e);
    }

    public void adicionarCamion(CamionRecolector c) {
        camiones.add(c);
    }

    public void adicionarContenedor(Contenedor c) {
        contenedores.add(c);
    }

    public void adicionarRuta(Ruta r) {
        rutas.add(r);
    }

    public void mostrarResumenSistema() {
        System.out.println("=== RESUMEN DEL SISTEMA ===");
        System.out.println("Total de empleados: " + empleados.size());
        System.out.println("Total de camiones: " + camiones.size());
        System.out.println("Total de contenedores: " + contenedores.size());
        System.out.println("Total de rutas: " + rutas.size());
    }
    public void motrarEmpleados(){
        System.out.println("Lista de empleados");
        for (Empleados emp : empleados){
            System.out.println("Nombre:" + emp.getNombre()+",CI :" + emp.getCi() + ",id" + emp.getIdEmpleados());
        }
    }
    public List<Empleado> getEmpleados(){
        return empleados;
    }
    public void setEmpleados(List<Empleado> empleados){
        this.empleado = empleados;
    }
    public List<CamionRecolector> getCamiones(){
        return camiones;
    }
    public void setCamiones(List<CamionesRecolector> camiones){
        this.camiones = camiones;
    }
    public List<Contenedore> getContenedores(){
        return contenedores;
    }
    public void setContenedores(List<Contenedores> contenedores){
        this.contenedores = contenedores;
    }
    public List<Ruta> getRutas(){
        return rutas;
    }
    public void setRutas(List<Rutas> rutas){
        this.rutas = rutas;
    } 
} 
