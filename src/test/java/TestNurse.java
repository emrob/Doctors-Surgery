import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestNurse {

    Nurse nurse;

    @Before
    public void setup(){ nurse = new Nurse("Sherry", "part time"); }

    @Test
    public void checkNursename(){
        assertEquals("Sherry", nurse.getName());
    }

    @Test
    public void testTreatPatient(){
        assertEquals("medicine administered", nurse.administer());
    }
}
