

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class UnitTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class UnitTest
{
    private Thermometer thermome1;
    private Thermometer thermome2;

    /**
     * Default constructor for test class UnitTest
     */
    public UnitTest()
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
        Thermometer.celsiusToFahrenheit(0);
        thermome1 = new Thermometer(0);
        thermome2 = new Thermometer(1);
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
    public void ConversionTest()
    {
        thermome1.setTemperatureUsingCelsius(100);
        thermome2.setTemperatureUsingCelsius(212);
    }

    @Test
    public void ConversionTest2()
    {
        thermome1.setTemperatureUsingCelsius(0);
        thermome2.setTemperatureUsingCelsius(32);
    }

    @Test
    public void Conversion3()
    {
        thermome1.setTemperatureUsingCelsius(-10);
        thermome2.setTemperatureUsingCelsius(400);
    }

    @Test
    public void ConversionTest4()
    {
    }

    @Test
    public void Conversion4()
    {
        thermome1.setTemperatureUsingCelsius(43);
        thermome2.setTemperatureUsingCelsius(1000);
    }
}





