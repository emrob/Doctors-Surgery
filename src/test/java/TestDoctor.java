import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDoctor {
    Doctor doctor;

    @Before
    public void setup() { doctor = new Doctor("Dr Roberts", "full time");}

    @Test
    public void checkDocName() {
        assertEquals("Dr Roberts", doctor.getName());
    }
}
