public class Thermometer
{
    // class variables, constants
    private static final double  DEGREE_RATIO        = 1.8;
    public static final  double  FREEZING_FAHRENHEIT = 32.0;
    public static final  double  FREEZING_CELSIUS    = 0.0;
    public static final  double  BOILING_FAHRENHEIT  = 212.0;
    public static final  double  BOILING_CELSIUS     = 100.0;

    // class methods
    // Write the class (static) methods here
    public static double fahrenheitToCelsius(double f){  
        return (f-FREEZING_FAHRENHEIT)/DEGREE_RATIO; 
    }

    public static double celsiusToFahrenheit(double c){  
        return (c*DEGREE_RATIO) + FREEZING_FAHRENHEIT; 
    }
    // instance variable
    private double currentTemperature;  // current temperature (in celsius)

    // WRITE THE CONSTRUCTORS FOR CHECKPOINT #3
    public Thermometer(){
        // currentTemperature = 0.0;
        this(0.0);
    }

    public Thermometer(double t){
        currentTemperature = t;
    }
    // instance methods
    // getCelsius
    public double getCelsius()
    {
        return currentTemperature;
    }

    // getFahrenheit
    public double getFahrenheit()
    {
        // REPLACE THIS LINE FOR CHECKPOINT #3
        return celsiusToFahrenheit(currentTemperature);
    }

    // set temperature using Celsius
    public void setTemperatureUsingCelsius (double degreesC)
    {
        currentTemperature = degreesC;   
    }

    // set temperature using Celsius
    public void setTemperatureUsingFahrenheit (double degreesF)
    {        
        // WRITE THE BODY OF THE METHOD FOR CHECKPOINT #3
        currentTemperature = fahrenheitToCelsius(degreesF);
    }
}