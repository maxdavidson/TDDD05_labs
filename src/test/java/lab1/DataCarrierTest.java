package lab1;

import org.junit.*;
import static org.junit.Assert.*;


public class DataCarrierTest {

    private DataCarrier dataCarrier;

    @Before
    public void setup() {
        dataCarrier = new DataCarrier(0, 0, 0, 0, 0, "rumpnisse");
    }

    @Test
    public void initialState() {
        assertEquals("rumpnisse", dataCarrier.getValue());
    }

    @Test
    public void uninitializedState() {
        dataCarrier.setState(1, 1, 1, 1, 1);
        assertNull(dataCarrier.getValue());
    }

    @Test
    public void invalidState() {
        dataCarrier.setState(2, 9, 4, 3, 1);
        dataCarrier.setValue("whaat");

        assertNull(dataCarrier.getValue());
    }

    @Test
    public void validState() {
        dataCarrier.setState(0, 1, 0, 1, 1);
        dataCarrier.setValue("whaat");

        assertEquals("whaat", dataCarrier.getValue());
    }

}
