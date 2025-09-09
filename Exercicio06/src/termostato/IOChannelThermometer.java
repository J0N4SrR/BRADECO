package termostato;

public class IOChannelThermometer implements Thermometer {
    @Override
    public double readTemperature() {
        return 18.5;
    }
}
