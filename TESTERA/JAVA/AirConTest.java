import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AirConTest {

    @Test
    public void iHaveAnAirconMyAirConIsOn() {
        AirCon myAirCon = new AirCon();
        myAirCon.turnOn();
        assertTrue(myAirCon.isOn());
    }

    @Test
    public void iHaveAnAirconMyAirConIsOnAndI_canTurnItOn() {
        AirCon myAirCon = new AirCon();
        myAirCon.turnOn();
        myAirCon.turnOff();
        assertFalse(myAirCon.isOn());
    }

    @Test
    public void iHaveAnAirConAndTemperatureCanIncreaseWhenOn() {
        AirCon myAirCon = new AirCon();
        myAirCon.turnOn();
        myAirCon.increaseTemperature();
        assertEquals(25, myAirCon.getTemperature());
    }

    @Test
    public void iHaveAnAirConAndTemperatureDecreaseWhenOn() {
        AirCon myAirCon = new AirCon();
        myAirCon.turnOn();
        myAirCon.decreaseTemperature();
        assertEquals(23, myAirCon.getTemperature());
    }

    @Test
    public void iHaveAnAirConAndTemperatureStaysSameWhenIncreaseTo_30() {
        AirCon myAirCon = new AirCon();
        myAirCon.turnOn();

        //myAirCon.increaseTemperature();
        //myAirCon.increaseTemperature();
        //myAirCon.increaseTemperature();
        //myAirCon.increaseTemperature();
        //myAirCon.increaseTemperature();
        //myAirCon.increaseTemperature();
        //myAirCon.increaseTemperature();

        for(int things = 0; things < 7; things++) {
            myAirCon.increaseTemperature();
        }

        assertEquals(30, myAirCon.getTemperature());
    }

    @Test
    public void iHaveAnAirConAndTemperatureStaysSameWhenDecreaseTo_16() {
        AirCon myAirCon = new AirCon();
        myAirCon.turnOn();

        //myAirCon.decreaseTemperature();
        //myAirCon.decreaseTemperature();
        //myAirCon.decreaseTemperature();
        //myAirCon.decreaseTemperature();
        //myAirCon.decreaseTemperature();
        //myAirCon.decreaseTemperature();
        //myAirCon.decreaseTemperature();
        //myAirCon.decreaseTemperature();

        for(int thing = 0; thing < 8; thing++) {
            myAirCon.decreaseTemperature();
        }

        assertEquals(16, myAirCon.getTemperature());
    }
}
