/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converterapp;

import java.util.HashMap;

/**
 *
 * @author 041406846
 */
public class Formulas {
    //Formulas class contains hashmap variable which stores every converting formal for the program
    private HashMap formulaMaps = new HashMap();
    
    public Formulas(double input){ //construction with double input, goes through to hashmap value
                                    // the keys naming are determinated by measurement unit names
        formulaMaps.put("centimetreToinch", input*0.39370); 
        formulaMaps.put("centimetreTofeet", input * 0.032808);
        formulaMaps.put("centimetreToyard", input * 0.010936);
        formulaMaps.put("centimetreTomile", input * 0.00000621);
        formulaMaps.put("metreToinch", input * 39.370);
        formulaMaps.put("metreTofeet", input * 3.2808);
        formulaMaps.put("metreToyard", input * 1.0936);
        formulaMaps.put("metreTomile", input * 0.00062137);
        formulaMaps.put("kilometreToinch", input * 39370);
        formulaMaps.put("kilometreTofeet", input * 3280.8);
        formulaMaps.put("kilometreToyard", input * 1093.6);
        formulaMaps.put("kilometreTomile", input * 0.62137);
        formulaMaps.put("celciusTofahrenheit", (input * 9/5) + 32);
        formulaMaps.put("inchTocentimetre", input / 0.39370);
        formulaMaps.put("feetToccentimetre", input / 0.032808);
        formulaMaps.put("yardTocentimetre", input / 0.010936);
        formulaMaps.put("mileToccentimetre", input / 0.00000621371);
        formulaMaps.put("inchTometre", input / 39.370);
        formulaMaps.put("feetTometre", input / 3.2808);
        formulaMaps.put("yardTometre", input / 1.0936);
        formulaMaps.put("mileTometre", input / 0.00062137119);
        formulaMaps.put("inchTokilometre", input / 39370);
        formulaMaps.put("feetTokilometre", input / 3280.8);
        formulaMaps.put("yardTokilometre", input / 1093.6);
        formulaMaps.put("mileTokilometre", input / 0.62137);
        formulaMaps.put("fahrenheitTocelcius", (input -32) * 5/9);
    }
    
    public double getValue(String sourceUnit, String targetUnit){ //get the value based source and target unit names
       if(formulaMaps.containsKey(sourceUnit+"To"+targetUnit)){ //get the value from key
           return (double) formulaMaps.get(sourceUnit+"To"+targetUnit); //get the double value
       } else {
           return -1; //return -1 for invalid units choosing
       }
        
    }
}
