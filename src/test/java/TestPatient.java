import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestPatient {
    Patient patient1;

    @Before
    public void setup(){
        patient1 = new Patient(SymptomLevel.High, "Jerry");
    }

    @Test
    public void checkPatientName(){
        assertEquals("Jerry", patient1.getName());
    }

    @Test
    public void checkSymptomLevel(){
        assertEquals(SymptomLevel.High, patient1.getSymptomlevel());
    }
}



