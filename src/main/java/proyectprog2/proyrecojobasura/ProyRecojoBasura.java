/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package proyectprog2.proyrecojobasura;
import java.util.*;

/**
 *
 * @author Lenovo
 */
public class ProyRecojoBasura {

    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE RECOJO DE BASURA ===\n");

        // Código anterior
        System.out.println("=== FUNCIONALIDADES ORIGINALES ===\n");
        
        // Funcionalidad 1: Registro de empleados y camiones
        Empleado emp1 = new Empleado("Juan Pérez", 35, "1234567", "EMP01", "06:00 - 14:00");
        Zona z1 = new Zona("Zona Sur", "Residencial");
        PuntoControl pc1 = new PuntoControl("PC01", z1.getNombreZona());
        emp1.agregarPunto(pc1);

        List<Zona> zonasRuta = Arrays.asList(z1, new Zona("Centro", "Comercial"));
        List<String> tiempos = Arrays.asList("06:00", "07:00");
        Ruta ruta = new Ruta("RUTA1", zonasRuta, tiempos);

        SensorCarga sensorC = new SensorCarga("Bosch", "S001", 1000);
        CamionRecolector camion = new CamionRecolector("C001", 1000, "06:00 - 12:00", ruta, sensorC);

        // Funcionalidad 2: Marcar punto de control completado
        pc1.marcarCompletado();
        emp1.mostrarPuntos();

        // Funcionalidad 3: Verificar si un contenedor está lleno
        Sensor sensorCont = new Sensor();
        Contenedor cont1 = new Contenedor("CT01", z1, 200, sensorCont);
        cont1.agregarBasura(210);
        System.out.println("¿Contenedor lleno? " + cont1.estaLleno());

        // Funcionalidad 4: Verificar si camión está lleno
        sensorC.agregarCarga(1000);
        System.out.println("¿Camión lleno? " + camion.estaLleno());

        // Funcionalidad 5: Mostrar ruta
        camion.mostrarRuta();

        System.out.println("\n=== NUEVAS FUNCIONALIDADES ===\n");

        // Crear instancias de todas las clases
        System.out.println("1. Creando Zona...");
        Zona zona = new Zona();
        System.out.println("Zona creada: " + zona.getNombreZona() + " - Tipo: " + zona.getTipo() + "\n");

        System.out.println("2. Creando Empleado...");
        Empleado empleado = new Empleado();
        System.out.println("Empleado creado: " + empleado.getNombre() + " - CI: " + empleado.getCi() + "\n");

        System.out.println("3. Creando PuntoControl...");
        PuntoControl puntoControl = new PuntoControl();
        System.out.println("Punto de Control creado: " + puntoControl.getIdPunto() + " - Zona: " + puntoControl.getZona() + "\n");

        System.out.println("4. Creando Sensor...");
        Sensor sensor = new Sensor();
        System.out.println("Sensor creado: " + sensor.getMarca() + " - ID: " + sensor.getIdSensor() + "\n");

        System.out.println("5. Creando SensorCarga...");
        SensorCarga sensorCarga = new SensorCarga();
        System.out.println("Sensor de Carga creado: " + sensorCarga.getMarca() + " - ID: " + sensorCarga.getIdSensor() + 
                         " - Carga Máxima: " + sensorCarga.getCargaMaxima() + "\n");

        System.out.println("6. Creando Ruta...");
        Ruta ruta2 = new Ruta();
        System.out.println("Ruta creada: " + ruta2.getIdRuta());
        System.out.println("Zonas en la ruta:");
        ruta2.mostrarRuta();
        System.out.println();

        System.out.println("7. Creando Contenedor...");
        Contenedor contenedor = new Contenedor();
        System.out.println("Contenedor creado: " + contenedor.getIdContenedor() + 
                         " - Capacidad Máxima: " + contenedor.getCapacidadMax() + "\n");

        System.out.println("8. Creando CamionRecolector...");
        CamionRecolector camion2 = new CamionRecolector();
        System.out.println("Camión creado: " + camion2.getIdCamion() + 
                         " - Carga Máxima: " + camion2.getCargaMaxima() + 
                         " - Horario: " + camion2.getHorarioRecojo() + "\n");

        System.out.println("9. Creando EmpresaLPL...");
        EmpresaLPL empresa = new EmpresaLPL();
        System.out.println("Empresa creada con datos iniciales:");
        empresa.mostrarResumenSistema();
        System.out.println();

        // Demostrar algunas funcionalidades
        System.out.println("=== DEMOSTRACIÓN DE FUNCIONALIDADES ===\n");

        System.out.println("1. Agregando basura al contenedor...");
        contenedor.agregarBasura(500.0);
        System.out.println("Peso actual del contenedor: " + contenedor.getPesoActual());
        System.out.println("¿Está lleno? " + contenedor.estaLleno() + "\n");

        System.out.println("2. Agregando punto de control al empleado...");
        empleado.agregarPunto(puntoControl);
        System.out.println("Puntos asignados al empleado:");
        empleado.mostrarPuntos();
        System.out.println();

        System.out.println("3. Mostrando ruta del camión...");
        System.out.println("Ruta asignada al camión:");
        camion2.mostrarRuta();
    }
}
