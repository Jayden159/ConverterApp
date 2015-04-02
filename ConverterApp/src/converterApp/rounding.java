/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converterApp;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Alex, Azhar, Russell and Jayden
 */
public class rounding {
    public static double round(double value, int places) { // for rounding into two digits after decimals
        if (places < 0) 
            throw new IllegalArgumentException();
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
