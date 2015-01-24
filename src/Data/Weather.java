/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author R06564
 */
public class Weather {
    public int year;
    public int month;
    public double maxTemp;
    public double minTemp;
    public int airFrost;
    public double rainfall;
    public double sunHours;
    
    
    public Weather(){
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public double getMaxTemp() {
        return maxTemp;
    }

    public double getMinTemp() {
        return minTemp;
    }

    public int getAirFrost() {
        return airFrost;
    }

    public double getRainfall() {
        return rainfall;
    }

    public double getSunHours() {
        return sunHours;
    }
}
