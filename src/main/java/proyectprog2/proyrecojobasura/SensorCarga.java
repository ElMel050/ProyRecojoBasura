package proyectprog2.proyrecojobasura;

public class SensorCarga extends Sensor {
    private double cargaActual;
    private double cargaMaxima;

    public SensorCarga() {
        super("SensoTech", "SEN001");
        this.cargaMaxima = 1000.0;
        this.cargaActual = 0.0;
    }

    public SensorCarga(String marca, String idSensor, double cargaMaxima) {
        super(marca, idSensor);
        this.cargaMaxima = cargaMaxima;
        this.cargaActual = 0;
    }

    public void agregarCarga(double carga) {
        this.cargaActual += carga;
    }

    @Override
    public boolean detectarEstadoContenedor() {
        return cargaActual >= cargaMaxima;
    }

    // Getters y Setters
    public double getCargaActual() {
        return cargaActual;
    }

    public void setCargaActual(double cargaActual) {
        this.cargaActual = cargaActual;
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }
} 