package termostato;

public class IOChannelHeater implements Heater {
    @Override
    public void turnOn() {
        System.out.println("Furnace ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Furnace OFF");
    }
}
