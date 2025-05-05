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
            System.out.println("\n=== SISTEMA DE RECOLECCIÃ“N DE BASURA ===");
            System.out.println("1. Agregar empleado");
            System.out.println("2. Agregar camiÃ³n recolector");
            System.out.println("3. Agregar contenedor");
            System.out.println("4. Agregar ruta");
            System.out.println("5. Mostrar resumen del sistema");
            System.out.println("6. Simular recolecciÃ³n");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opciÃ³n: ");
            
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
                    System.out.println("OpciÃ³n no vÃ¡lida");
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
        
        System.out.print("Horario (MaÃ±ana/Tarde/Noche): ");
        String horario = scanner.nextLine();

        Empleado empleado = new Empleado(nombre, edad, ci, idEmpleado, horario);
        
        // Agregar puntos de control
        System.out.print("Â¿Desea agregar puntos de control? (s/n): ");
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
        System.out.println("\n--- AGREGAR CAMIÃ“N RECOLECTOR ---");
        System.out.print("ID CamiÃ³n: ");
        String idCamion = scanner.nextLine();
        
        System.out.print("Carga mÃ¡xima (kg): ");
        double cargaMaxima = scanner.nextDouble();
        scanner.nextLine();
        
        System.out.print("Horario de recolecciÃ³n: ");
        String horarioRecojo = scanner.nextLine();
        
        // Crear sensor de carga
        System.out.println("\n--- DATOS DEL SENSOR DE CARGA ---");
        System.out.print("Marca del sensor: ");
        String marcaSensor = scanner.nextLine();
        
        System.out.print("ID Sensor: ");
        String idSensor = scanner.nextLine();
        
        SensorCarga sensor = new SensorCarga(marcaSensor, idSensor, cargaMaxima);
        
        // Crear ruta bÃ¡sica
        Ruta ruta = new Ruta();
        
        CamionRecolector camion = new CamionRecolector(idCamion, cargaMaxima, horarioRecojo, ruta, sensor);
        empresa.adicionarCamion(camion);
        System.out.println("CamiÃ³n agregado exitosamente!");
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
        
        System.out.print("Capacidad mÃ¡xima (kg): ");
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
            
            System.out.print("Hora de recolecciÃ³n (HH:MM): ");
            String tiempo = scanner.nextLine();
            
            zonas.add(new Zona(nombreZona, tipoZona));
            tiempos.add(tiempo);
        }
        
        Ruta ruta = new Ruta(idRuta, zonas, tiempos);
        empresa.adicionarRuta(ruta);
        System.out.println("Ruta agregada exitosamente!");
    }

    private static void simularRecoleccion(EmpresaLPL empresa) {
        System.out.println("\n--- SIMULACIÃ“N DE RECOLECCIÃ“N ---");
        
        // Simular llenado de contenedores
        System.out.print("Ingrese el peso de basura a agregar a los contenedores (kg): ");
        double pesoBasura = scanner.nextDouble();
        scanner.nextLine();
        
        // Simular recolecciÃ³n por camiones
        System.out.println("\n--- ESTADO DE LOS CONTENEDORES ---");
        // AquÃ­ irÃ­a la lÃ³gica para simular el llenado de contenedores
        
        System.out.println("\n--- ESTADO DE LOS CAMIONES ---");
        // AquÃ­ irÃ­a la lÃ³gica para simular la recolecciÃ³n por camiones
        
        System.out.println("SimulaciÃ³n completada!");
    }
}
