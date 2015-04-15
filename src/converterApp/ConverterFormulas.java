package converterApp;

import java.util.HashMap;

/**
 *
 * @author @author Alex, Azhar, Russell and Jayden
 */
public class ConverterFormulas {
    
    private HashMap ISToUS = new HashMap();    
    
    public ConverterFormulas(double input){
        ISToUS.put("cmToinch", input * 0.39370);
        ISToUS.put("cmTofeet", input * 0.032808);
        ISToUS.put("cmToyard", input * 0.010936);
        ISToUS.put("cmTomile", input * 0.00000621);
        ISToUS.put("meterToinch", input * 39.370);
        ISToUS.put("meterTofeet", input * 3.2808);
        ISToUS.put("meterToyard", input * 1.0936);
        ISToUS.put("meterTomile", input * 0.00062137);
        ISToUS.put("kiometerToinch", input * 39370);
        ISToUS.put("kiometerTofeet", input * 3280.8);
        ISToUS.put("kiometerToyard", input * 1093.6);
        ISToUS.put("kiometerTomile", input * 0.62137);
        ISToUS.put("celciusTohahrenheit", (input * 9/5) + 32);
    }
    
    public double getValue(String sourceUnit, String targetUnit){
       return (double) ISToUS.get(sourceUnit+"To"+targetUnit);
    }
}
