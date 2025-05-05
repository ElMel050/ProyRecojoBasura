package proyectprog2.proyrecojobasura;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProyRecojoBasura {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        EmpresaLPL empresa = new EmpresaLPL();
        int opcion;

        do {
            System.out.println("\n=== SISTEMA DE RECOLECCIÓN DE BASURA ===");
            System.out.println("1. Agregar empleado");
            System.out.println("2. Agregar camión recolector");
            System.out.println("3. Agregar contenedor");
            System.out.println("4. Agregar ruta");
            System.out.println("5. Mostrar resumen del sistema");
            System.out.println("6. Simular recolección");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    agregarEmpleado(empresa);
                    break;
                case 2:
                    agregarCamion(empresa);
                    break;
                case 3:
                    agregarContenedor(empresa);
                    break;
                case 4:
                    agregarRuta(empresa);
                    break;
                case 5:
                    empresa.mostrarResumenSistema();
                    break;
                case 6:
                    simularRecoleccion(empresa);
                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 0);
    }

    private static void agregarEmpleado(EmpresaLPL empresa) {
        System.out.println("\n--- AGREGAR EMPLEADO ---");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("CI: ");
        String ci = scanner.nextLine();
        
        System.out.print("ID Empleado: ");
        String idEmpleado = scanner.nextLine();
        
        System.out.print("Horario (Mañana/Tarde/Noche): ");
        String horario = scanner.nextLine();

        Empleado empleado = new Empleado(nombre, edad, ci, idEmpleado, horario);
        
        // Agregar puntos de control
        System.out.print("¿Desea agregar puntos de control? (s/n): ");
        String respuesta = scanner.nextLine();
        
        if (respuesta.equalsIgnoreCase("s")) {
            System.out.print("Cuantos puntos desea agregar: ");
            int numPuntos = scanner.nextInt();
            scanner.nextLine();
            
            for (int i = 0; i < numPuntos; i++) {
                System.out.println("\nPunto #" + (i+1));
                System.out.print("ID Punto: ");
                String idPunto = scanner.nextLine();
                
                System.out.print("Zona: ");
                String zona = scanner.nextLine();
                
                PuntoControl punto = new PuntoControl(idPunto, zona);
                empleado.agregarPunto(punto);
            }
        }
        
        empresa.adicionarEmpleado(empleado);
        System.out.println("Empleado agregado exitosamente!");
        empresa.mostrarEmpleados();

    }

    private static void agregarCamion(EmpresaLPL empresa) {
        System.out.println("\n--- AGREGAR CAMIÓN RECOLECTOR ---");
        System.out.print("ID Camión: ");
        String idCamion = scanner.nextLine();
        
        System.out.print("Carga máxima (kg): ");
        double cargaMaxima = scanner.nextDouble();
        scanner.nextLine();
        
        System.out.print("Horario de recolección: ");
        String horarioRecojo = scanner.nextLine();
        
        // Crear sensor de carga
        System.out.println("\n--- DATOS DEL SENSOR DE CARGA ---");
        System.out.print("Marca del sensor: ");
        String marcaSensor = scanner.nextLine();
        
        System.out.print("ID Sensor: ");
        String idSensor = scanner.nextLine();
        
        SensorCarga sensor = new SensorCarga(marcaSensor, idSensor, cargaMaxima);
        
        // Crear ruta básica
        Ruta ruta = new Ruta();
        
        CamionRecolector camion = new CamionRecolector(idCamion, cargaMaxima, horarioRecojo, ruta, sensor);
        empresa.adicionarCamion(camion);
        System.out.println("Camión agregado exitosamente!");
    }

    private static void agregarContenedor(EmpresaLPL empresa) {
        System.out.println("\n--- AGREGAR CONTENEDOR ---");
        System.out.print("ID Contenedor: ");
        String idContenedor = scanner.nextLine();
        
        System.out.println("\n--- DATOS DE LA ZONA ---");
        System.out.print("Nombre de la zona: ");
        String nombreZona = scanner.nextLine();
        
        System.out.print("Tipo de zona (Residencial/Comercial/Industrial): ");
        String tipoZona = scanner.nextLine();
        
        Zona zona = new Zona(nombreZona, tipoZona);
        
        System.out.print("Capacidad máxima (kg): ");
        double capacidadMax = scanner.nextDouble();
        scanner.nextLine();
        
        // Crear sensor de carga
        System.out.println("\n--- DATOS DEL SENSOR DE CARGA ---");
        System.out.print("Marca del sensor: ");
        String marcaSensor = scanner.nextLine();
        
        System.out.print("ID Sensor: ");
        String idSensor = scanner.nextLine();
        
        SensorCarga sensor = new SensorCarga(marcaSensor, idSensor, capacidadMax);
        
        Contenedor contenedor = new Contenedor(idContenedor, zona, capacidadMax, sensor);
        empresa.adicionarContenedor(contenedor);
        System.out.println("Contenedor agregado exitosamente!");
    }

    private static void agregarRuta(EmpresaLPL empresa) {
        System.out.println("\n--- AGREGAR RUTA ---");
        System.out.print("ID Ruta: ");
        String idRuta = scanner.nextLine();
        
        List<Zona> zonas = new ArrayList<>();
        List<String> tiempos = new ArrayList<>();
        
        System.out.print("Cuantas zonas desea agregar a la ruta: ");
        int numZonas = scanner.nextInt();
        scanner.nextLine();
        
        for (int i = 0; i < numZonas; i++) {
            System.out.println("\nZona #" + (i+1));
            System.out.print("Nombre de la zona: ");
            String nombreZona = scanner.nextLine();
            
            System.out.print("Tipo de zona (Residencial/Comercial/Industrial): ");
            String tipoZona = scanner.nextLine();
            
            System.out.print("Hora de recolección (HH:MM): ");
            String tiempo = scanner.nextLine();
            
            zonas.add(new Zona(nombreZona, tipoZona));
            tiempos.add(tiempo);
        }
        
        Ruta ruta = new Ruta(idRuta, zonas, tiempos);
        empresa.adicionarRuta(ruta);
        System.out.println("Ruta agregada exitosamente!");
    }

    private static void simularRecoleccion(EmpresaLPL empresa) {
    System.out.println("\n=== SIMULACIÓN DE RECOLECCIÓN ===");
    Scanner scanner = new Scanner(System.in);

    // 1. Simular generación de basura en contenedores
    System.out.println("\n--- LLENANDO CONTENEDORES ---");
    for (Contenedor contenedor : empresa.getContenedores()) {
        System.out.print("Ingrese peso de basura a agregar al contenedor " + contenedor.getIdContenedor() 
                        + " (Capacidad: " + contenedor.getCapacidadMax() + " kg): ");
        double basura = scanner.nextDouble();
        contenedor.agregarBasura(basura);
        
        System.out.println("Contenedor " + contenedor.getIdContenedor() + 
                         " - Peso actual: " + contenedor.getPesoActual() + 
                         " kg - " + (contenedor.estaLleno() ? "LLENO" : "Disponible"));
    }

    // 2. Asignar contenedores llenos a camiones según rutas
    System.out.println("\n--- ASIGNANDO RECOLECCIÓN ---");
    for (CamionRecolector camion : empresa.getCamiones()) {
        System.out.println("\nCamión " + camion.getIdCamion() + " - Capacidad: " + 
                         camion.getCargaMaxima() + " kg - Ruta: ");
        camion.mostrarRuta();
        
        double cargaActualCamion = 0;
        boolean camionLleno = false;

        // 3. Recolectar en cada zona de la ruta
        for (Zona zonaRuta : camion.getRuta().getZonas()) {
            if (camionLleno) break;
            
            System.out.println("\nRecolectando en zona: " + zonaRuta.getNombreZona());
            
            // 4. Buscar contenedores llenos en esta zona
            for (Contenedor contenedor : empresa.getContenedores()) {
                if (contenedor.getZonaUbicacion().getNombreZona().equals(zonaRuta.getNombreZona()) 
                    && contenedor.estaLleno()) {
                    
                    double basura = contenedor.getPesoActual();
                    double capacidadDisponible = camion.getCargaMaxima() - cargaActualCamion;
                    
                    if (basura <= capacidadDisponible) {
                        // Vaciar contenedor
                        contenedor.setPesoActual(0);
                        cargaActualCamion += basura;
                        camion.getSensorCarga().agregarCarga(basura);
                        
                        System.out.println("  → Recolectado " + basura + " kg del contenedor " + 
                                         contenedor.getIdContenedor() + 
                                         " | Carga acumulada: " + cargaActualCamion + " kg");
                        
                        // Registrar punto de control para empleados
                        PuntoControl punto = new PuntoControl(
                            "PCT-" + contenedor.getIdContenedor(), 
                            zonaRuta.getNombreZona()
                        );
                        punto.marcarCompletado();
                        empresa.getEmpleados().get(0).agregarPunto(punto); // Asignar al primer empleado
                    } else {
                        System.out.println("  × No hay capacidad para recolectar " + basura + 
                                         " kg (Disponible: " + capacidadDisponible + " kg)");
                        camionLleno = true;
                        break;
                    }
                }
            }
        }

        // 5. Mostrar resumen por camión
        System.out.println("\nResumen del camión " + camion.getIdCamion() + ":");
        System.out.println("  - Total recolectado: " + cargaActualCamion + " kg");
        System.out.println("  - Estado: " + (camion.estaLleno() ? "LLENO - Volviendo a base" : "Disponible"));
    }

    // 6. Mostrar estado final de contenedores
    System.out.println("\n--- ESTADO FINAL DE CONTENEDORES ---");
    for (Contenedor contenedor : empresa.getContenedores()) {
        System.out.println("Contenedor " + contenedor.getIdContenedor() + 
                         " - Peso: " + contenedor.getPesoActual() + 
                         " kg - " + (contenedor.estaLleno() ? "LLENO (no recolectado)" : "Vacío"));
    }

    }
    
}
