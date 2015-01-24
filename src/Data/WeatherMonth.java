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
public class WeatherMonth {
    private String[] weatherStats;
    public int year;
    public int month;
    public double maxTemp;
    public double minTemp;
    public int airFrost;
    public double rainfall;
    public double sunHours;
    
    
    public WeatherMonth(String weather){
        weatherStats = weather.split(":");
        year = Integer.valueOf(weatherStats[0]);
        month = getMonth(String.valueOf(weatherStats[1]));
        maxTemp = Double.valueOf(weatherStats[2]);
        minTemp = Double.valueOf(weatherStats[3]);
        airFrost = Integer.valueOf(weatherStats[4]);
        rainfall = Double.valueOf(weatherStats[5]);
        sunHours = Double.valueOf(weatherStats[6]);
    }

    public int getYear() {
        return year;
    }

    public int getMonth(String monthText) {
        switch(monthText){
            case("JAN"): 
                month = 1;
                break;
            case("FEB"): 
                month = 2;
                break;
            case("MAR"): 
                month = 3;
                break;
            case("MAY"): 
                month = 4;
                break;
            case("APR"): 
                month = 5;
                break;
            case("JUN"): 
                month = 6;
                break;
            case("JUL"): 
                month = 7;
                break;
            case("AUG"): 
                month = 8;
                break;
            case("SEP"): 
                month = 9;
                break;
            case("OCT"): 
                month = 10;
                break;
            case("NOV"): 
                month = 11;
                break;
            case("DEC"): 
                month = 12;
                break;
        }
        return month;
    }
    
    public int getMonthText() {
        return month;
    }

    public double getMaxTemp() {
        return maxTemp;
    }
    
    public double getAvgTemp(){
        Double avgTemp = 0.0;
        avgTemp = (getMaxTemp()+getMinTemp())/2;
        return avgTemp;
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
