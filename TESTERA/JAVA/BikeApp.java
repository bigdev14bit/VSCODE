public class BikeApp {
    private boolean isOn;
    private int speed;

    public void turnOn() {
        isOn = true;
        speed = 0;
    }
    public void turnOff() {
        isOn = false;
    } 

    public boolean isOn() {
        return isOn;
    }
    public int getSpeed() {
        return speed;
    }
    public void accelerate() {
        
    }
}
