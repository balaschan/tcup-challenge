import com.tcup.challenge.CeilingFan;
import com.tcup.challenge.Direction;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.tcup.challenge.CeilingFan.OFF;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CeilingFanTest {

    private CeilingFan ceilingFan;

    @BeforeEach
    void setUp() throws Exception {
        ceilingFan = new CeilingFan();
    }

    @Test
    void testSpeedUp() {
        assertEquals(Direction.forward, ceilingFan.getDirection());
        assertEquals(OFF, ceilingFan.getSpeed());

        ceilingFan.speedUp();
        assertEquals(1, ceilingFan.getSpeed());
        assertEquals(Direction.forward, ceilingFan.getDirection());

        ceilingFan.speedUp();
        assertEquals(2, ceilingFan.getSpeed());
        assertEquals(Direction.forward, ceilingFan.getDirection());

        ceilingFan.speedUp();
        assertEquals(3, ceilingFan.getSpeed());
        assertEquals(Direction.forward, ceilingFan.getDirection());

        ceilingFan.speedUp();
        assertEquals(OFF, ceilingFan.getSpeed());
        assertEquals(Direction.forward, ceilingFan.getDirection());
    }


    @Test
    void testReverseDirection() {
        assertEquals(Direction.forward, ceilingFan.getDirection());
        assertEquals(OFF, ceilingFan.getSpeed());

        ceilingFan.reverseDirection();
        assertEquals(Direction.backward, ceilingFan.getDirection());
        assertEquals(OFF, ceilingFan.getSpeed());

        ceilingFan.speedUp();
        assertEquals(1, ceilingFan.getSpeed());
        assertEquals(Direction.backward, ceilingFan.getDirection());

        ceilingFan.speedUp();
        assertEquals(2, ceilingFan.getSpeed());
        assertEquals(Direction.backward, ceilingFan.getDirection());

        ceilingFan.speedUp();
        assertEquals(3, ceilingFan.getSpeed());
        assertEquals(Direction.backward, ceilingFan.getDirection());

        ceilingFan.speedUp();
        assertEquals(OFF, ceilingFan.getSpeed());
        assertEquals(Direction.backward, ceilingFan.getDirection());
    }

    @Test
    void testReverseSpeedupDirection() {
        assertEquals(OFF, ceilingFan.getSpeed());
        assertEquals(Direction.forward, ceilingFan.getDirection());

        ceilingFan.reverseDirection();
        assertEquals(OFF, ceilingFan.getSpeed());
        assertEquals(Direction.backward, ceilingFan.getDirection());

        ceilingFan.speedUp();
        assertEquals(1, ceilingFan.getSpeed());
        assertEquals(Direction.backward, ceilingFan.getDirection());

        ceilingFan.reverseDirection();
        assertEquals(1, ceilingFan.getSpeed());
        assertEquals(Direction.forward, ceilingFan.getDirection());

        ceilingFan.speedUp();
        assertEquals(2, ceilingFan.getSpeed());
        assertEquals(Direction.forward, ceilingFan.getDirection());

        ceilingFan.reverseDirection();
        assertEquals(2, ceilingFan.getSpeed());
        assertEquals(Direction.backward, ceilingFan.getDirection());

        ceilingFan.speedUp();
        assertEquals(3, ceilingFan.getSpeed());
        assertEquals(Direction.backward, ceilingFan.getDirection());

        ceilingFan.reverseDirection();
        assertEquals(3, ceilingFan.getSpeed());
        assertEquals(Direction.forward, ceilingFan.getDirection());

        ceilingFan.speedUp();
        assertEquals(OFF, ceilingFan.getSpeed());
        assertEquals(Direction.forward, ceilingFan.getDirection());

        ceilingFan.reverseDirection();
        assertEquals(OFF, ceilingFan.getSpeed());
        assertEquals(Direction.backward, ceilingFan.getDirection());

    }


}
