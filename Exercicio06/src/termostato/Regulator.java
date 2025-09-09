package termostato;

public class Regulator {
    private Thermometer thermometer;
    private Heater heater;

    public Regulator(Thermometer thermometer, Heater heater) {
        this.thermometer = thermometer;
        this.heater = heater;
    }

    public void regulate(double minTemp, double maxTemp) {
        double currentTemp = thermometer.readTemperature();

        if (currentTemp < minTemp) {
            heater.turnOn();
        } else if (currentTemp > maxTemp) {
            heater.turnOff();
        } else {
            System.out.println("Temperatura: " + currentTemp);
        }
    }
}
