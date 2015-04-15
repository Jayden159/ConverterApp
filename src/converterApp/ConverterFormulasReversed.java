/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converterApp;

/**
 *
 * @author Alex, Azhar, Russell and Jayden
 */
public class ConverterFormulasReversed 
{
    //Inch to cm
    public static double inchToCm(double input) {
        double result = input / 0.39370;
        return result;
    }
    //Feet to Cm
    public static double feetToCm(double input) {
        double result = input / 0.032808;
        return result;
    }
    //Yards to Cm
    public static double yardToCm(double input) {
        double result = input / 0.010936;
        return result;
    }
    //miles to cm
    public static double mileToCm(double input) {
        double result = input / 0.00000621371;
        return result;
    }
    //inches to meters 
    public static double inchToMeter(double input) {
        double result = input / 39.370;
        return result;
    }
    //Feet to meters
    public static double feetToMeter(double input) {
        double result = input / 3.2808;
        return result;
    }
    //Yards to Meters
    public static double yardToMeter(double input) {
        double result = input / 1.0936;
        return result;
    }
    //Miles to Meters
    public static double mileToMeter(double input) {
        double result = input / 0.00062137119;
        return result;
    }
    //Inches to Kilometers
    public static double inchToKilometer(double input) {
        double result = input / 39370;
        return result;
    }
    //Feet to Kilometers
    public static double feetToKilometer(double input) {
        double result = input / 3280.8;
        return result;
    }
    //Yards to Kilometers
    public static double yardToKilometer(double input) {
        double result = input / 1093.6;
        return result;
    }
    //Miles to Kilometers
    public static double mileToKilometer(double input) {
        double result = input / 0.62137;
        return result;
    }
    //Fahrenheit to Celcius
    public static double fahrenheitToCelcius(double input) {
        double result = (input -32) * 5/9;
        return result;
    }
}
