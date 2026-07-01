public class AirCon {
    private boolean isOn;
    private int temperature;

    public void turnOn() {
        isOn = true;
        temperature = 24;
    }
    public void turnOff() {
        isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }
    public int getTemperature() {
        return temperature;
    }
    public void increaseTemperature() {
        if(temperature < 30) {
            temperature = temperature + 1;
        }
    }
    public void decreaseTemperature() {
        if(temperature > 16) {
        temperature = temperature - 1;
        }
    }
}
