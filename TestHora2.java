

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class TestHora2.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestHora2
{
    /**
     * Default constructor for test class TestHora2
     */
    public TestHora2()
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
    public void testCase01()
    {
        Hora hora1 = new Hora(12);
        assertEquals(0, hora1.getSegundos());
    }

    @Test
    public void testCase02()
    {
        Hora hora1 = new Hora(17, 25);
        hora1.tick();
        assertEquals("5:25:01 PM", hora1.toString());
    }

    @Test
    public void testCase03()
    {
        Hora hora1 = new Hora(13, 25, 55);
        hora1.tick();
        hora1.tick();
        hora1.tick();
        hora1.tick();
        hora1.tick();
        hora1.tick();
        hora1.tick();
        assertEquals("1:26:02 PM", hora1.toString());
    }

    @Test
    public void testCase04()
    {
        Hora hora1 = new Hora(19, 25, 15);
        hora1.setMinutos(100);
        assertEquals("7:00:15 PM", hora1.toString());
    }

    @Test
    public void testCase05()
    {
        Hora hora1 = new Hora(5, 39);
        hora1.setMinutos(15);
        hora1.tick();
        assertEquals("5:15:01 AM", hora1.toString());
    }

    @Test
    public void testCase06()
    {
        Hora hora1 = new Hora();
        hora1.setHoras(19);
        hora1.tick();
        assertEquals("7:00:01 PM", hora1.toString());
    }

    @Test
    public void testCase07()
    {
        Hora hora1 = new Hora(15, 15);
        hora1.setSegundos(19);
        hora1.tick();
        assertEquals("3:15:20 PM", hora1.toString());
    }

    @Test
    public void testCase08()
    {
        Hora hora1 = new Hora(18, 16, 16);
        hora1.setSegundos(90);
        hora1.tick();
        assertEquals("6:16:01 PM", hora1.toString());
    }

    @Test
    public void testCase09()
    {
        Hora hora1 = new Hora(15, 9, 5);
        assertEquals("3:09:05 PM", hora1.toString());
    }

    @Test
    public void testCase10()
    {
        Hora hora1 = new Hora(23, 0, 59);
        hora1.tick();
        hora1.setMinutos(59);
        hora1.tick();
        assertEquals("11:59:01 PM", hora1.toString());
    }
}
