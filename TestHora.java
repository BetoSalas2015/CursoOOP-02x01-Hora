import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class TestHora.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestHora
{
    /**
     * Default constructor for test class TestHora
     */
    public TestHora()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void TestCase01()
    {
        Hora hora1 = new Hora();
        hora1.tick();
        assertEquals("12:00:01 AM", hora1.toString());
    }
    
    @Test
    public void testCase02()
    {
        Hora hora = new Hora(7,0,58);
        hora.tick();
        hora.tick();
        assertEquals(hora.toString(), "7:01:00 AM");
    }
    
    @Test    
    public void testCase03()
    {
        Hora hora = new Hora(17,59,58);
        hora.tick();
        hora.tick();
        assertEquals(hora.toString(), "6:00:00 PM");
    }
    
    @Test    
    public void testCase04()
    {
        Hora hora = new Hora(23,59,58);
        hora.tick();
        hora.tick();
        assertEquals(hora.toString(), "12:00:00 AM");
    }
    
    @Test
    public void testCase05()
    {
        Hora hora = new Hora(11,59,58);
        hora.tick();
        hora.tick();
        assertEquals(hora.toString(), "12:00:00 PM");
    }
    
    @Test    
    public void testCase06()
    {
        Hora hora = new Hora(17,13,58);
        hora.setMinutos(30);
        assertEquals(hora.toString(), "5:30:58 PM");
    }
    
    @Test    
    public void testCase07()
    {
        Hora hora = new Hora(12,00,00);
        hora.setMinutos(40);
        hora.setSegundos(10);
        hora.tick();
        assertEquals(hora.toString(), "12:40:11 PM");
    }
    
    @Test    
    public void testCase08()
    {
        Hora hora = new Hora(7,0,0);
        hora.setHoras(19);
        assertEquals(hora.toString(), "7:00:00 PM");
    }
    
    @Test    
    public void testCase09()
    {
        Hora hora = new Hora(7,0,0);
        assertEquals(hora.toString(), "7:00:00 AM");
    }
    
    @Test
    public void testCase10()
    {
        Hora hora = new Hora(7,0,0);
        for(int i = 1; i <= 100; i++)
            hora.tick();
        assertEquals(hora.toString(), "7:01:40 AM");
    }
    
    @Test
    public void testCase11()
    {
        Hora hora = new Hora(7,0,0);
        for(int i = 1; i <= 10000; i++)
            hora.tick();
        assertEquals(hora.toString(), "9:46:40 AM");
    }
}

