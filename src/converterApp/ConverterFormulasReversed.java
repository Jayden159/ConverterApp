/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converterApp;

import java.util.HashMap;

/**
 *
 * @author Alex, Azhar, Russell and Jayden
 */
public class ConverterFormulasReversed 
{
private HashMap USToIS = new HashMap();
        
    public ConverterFormulasReversed(double input){
        USToIS.put("inchTocm", input / 0.39370);
        USToIS.put("feetTocm", input / 0.032808);
        USToIS.put("yardTocm", input / 0.010936);
        USToIS.put("mileTocm", input / 0.00000621371);
        USToIS.put("inchTometer", input / 39.370);
        USToIS.put("feetTometer", input / 3.2808);
        USToIS.put("yardTometer", input / 1.0936);
        USToIS.put("milesTometer", input / 0.00062137119);
        USToIS.put("inchTokilometer", input / 39370);
        USToIS.put("feetTokilometer", input / 3280.8);
        USToIS.put("yardTokilometer", input / 1093.6);
        USToIS.put("mileTokilometer", input / 0.62137);
        USToIS.put("fahrenheitTocelcius", (input -32) * 5/9);
        
    }
    
    public double getValue(String sourceUnit, String targetUnit){
       return (double) USToIS.get(sourceUnit+"To"+targetUnit);
    }
}
/*Inch to cm

    //Fahrenheit to Celcius
    public static double fahrenheitToCelcius(double input) {
        double result = (input -32) * 5/9;
        return result;
    }*/
