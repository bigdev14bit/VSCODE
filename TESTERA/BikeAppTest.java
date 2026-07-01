import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BikeAppTest {

    @Test
    public void iHaveBikeAndI_CanTurnItOn() {
        BikeApp nigasaki = new BikeApp();
        nigasaki.turnOn();
        assertTrue(nigasaki.isOn());
        assertEquals(0, nigasaki.getSpeed());
    }

    @Test
    public void iHaveBikeAndI_CanTurnItOFF() {
        BikeApp nigasaki = new BikeApp();
        nigasaki.turnOn();
        nigasaki.turnOff();
        assertFalse(nigasaki.isOn());
    }

    @Test
    public void iHaveBikeAndI_CanAccelerateIt() {
        BikeApp nigasaki = new BikeApp();
        nigasaki.turnOn();
        nigasaki.accelerate();
        assertEquals(1, nigasaki.getSpeed());

    }
}
