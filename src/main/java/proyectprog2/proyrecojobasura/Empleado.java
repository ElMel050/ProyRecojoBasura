package proyectprog2.proyrecojobasura;

import java.util.ArrayList;
import java.util.List;

public class Empleado {
    private String nombre;
    private int edad;
    private String ci;
    private String idEmpleado;
    private String horario;
    private List<PuntoControl> puntos;

    public Empleado() {
        this.nombre = "Juan Pérez";
        this.edad = 30;
        this.ci = "12345678";
        this.idEmpleado = "EMP001";
        this.horario = "Mañana";
        this.puntos = new ArrayList<>();
    }

    public Empleado(String nombre, int edad, String ci, String idEmpleado, String horario) {
        this.nombre = nombre;
        this.edad = edad;
        this.ci = ci;
        this.idEmpleado = idEmpleado;
        this.horario = horario;
        this.puntos = new ArrayList<>();
    }

    public void agregarPunto(PuntoControl p) {
        puntos.add(p);
    }

    public void mostrarPuntos() {
        for (PuntoControl p : puntos) {
            System.out.println("Zona: " + p.getZona() + " - Completado: " + p.isCompletado());
        }
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
} 