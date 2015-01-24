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
public class WeatherYear {
    public int year;
    public String[] maxTemps;
    public String[] minTemps;
    public String[] airFrosts;
    public String[] rainfalls;
    public String[] sunHours;
    
    public WeatherYear(int wYear, String wMaxTemps, String wMinTemps,
            String wAirFrosts, String wRainfalls, String wSunHours){
        year = wYear;
        wMaxTemps = wMaxTemps.replaceAll("[\\[\\] ]", "");
        maxTemps = wMaxTemps.split(":");
        wMinTemps = wMinTemps.replaceAll("[\\[\\] ]", "");
        minTemps = wMinTemps.split(":");
        wAirFrosts = wAirFrosts.replaceAll("[\\[\\] ]", "");
        airFrosts = wAirFrosts.split(":");
        wRainfalls = wRainfalls.replaceAll("[\\[\\] ]", "");
        rainfalls = wRainfalls.split(":");
        wSunHours = wSunHours.replaceAll("[\\[\\] ]", "");
        sunHours = wSunHours.split(":");
    }
    
    public Double getMaxTemp(){
        double maxTemp;
        Double[] gMaxTemps = new Double[12];
        for(int i = 0; i<12 ; i++){
            gMaxTemps[i] = Double.valueOf(maxTemps[i]);
        }
        if (gMaxTemps[0] > gMaxTemps[1]) {
            maxTemp = gMaxTemps[0];
        } else {
            maxTemp = gMaxTemps[1];
        }
        for(int i = 1; i<12; i++){
            if(maxTemp<gMaxTemps[i]){
                maxTemp = gMaxTemps[i];
            }
        }
        return maxTemp;
    }
    
    public Double getMinTemp(){
        double minTemp;
        Double[] gMinTemps = new Double[12];
        for(int i = 0; i<12 ; i++){
            gMinTemps[i] = Double.valueOf(maxTemps[i]);
        }
        if (gMinTemps[0] < gMinTemps[1]) {
            minTemp = gMinTemps[0];
        } else {
            minTemp = gMinTemps[1];
        }
        for(int i = 1; i<12; i++){
            if(minTemp>gMinTemps[i]){
                minTemp = gMinTemps[i];
            }
        }
        return minTemp;
    }
    
    public int getMaxAirforst(){
        int maxAirfrost;
        int[] gMaxAirfrost = new int[12];
        for(int i = 0; i<12 ; i++){
            gMaxAirfrost[i] = Integer.valueOf(airFrosts[i]);
        }
        if (gMaxAirfrost[0] > gMaxAirfrost[1]) {
            maxAirfrost = gMaxAirfrost[0];
        } else {
            maxAirfrost = gMaxAirfrost[1];
        }
        for(int i = 1; i<12; i++){
            if(maxAirfrost<gMaxAirfrost[i]){
                maxAirfrost = gMaxAirfrost[i];
            }
        }
        return maxAirfrost;
    }
    
    public int getMinAirforst(){
        int minAirfrost;
        int[] gMinAirfrost = new int[12];
        for(int i = 0; i<12 ; i++){
            gMinAirfrost[i] = Integer.valueOf(airFrosts[i]);
        }
        if (gMinAirfrost[0] < gMinAirfrost[1]) {
            minAirfrost = gMinAirfrost[0];
        } else {
            minAirfrost = gMinAirfrost[1];
        }
        for(int i = 1; i<12; i++){
            if(minAirfrost>gMinAirfrost[i]){
                minAirfrost = gMinAirfrost[i];
            }
        }
        return minAirfrost;
    }
    
    public Double getMaxRainfall(){
        Double maxRainfall;
        Double[] gMaxRainfall = new Double[12];
        for(int i = 0; i<12 ; i++){
            gMaxRainfall[i] = Double.valueOf(rainfalls[i]);
        }
        if (gMaxRainfall[0] > gMaxRainfall[1]) {
            maxRainfall = gMaxRainfall[0];
        } else {
            maxRainfall = gMaxRainfall[1];
        }
        for(int i = 1; i<12; i++){
            if(maxRainfall<gMaxRainfall[i]){
                maxRainfall = gMaxRainfall[i];
            }
        }
        return maxRainfall;
    }
    
    public Double getMinRainfall(){
        Double minRainfall;
        Double[] gMinRainfall = new Double[12];
        for(int i = 0; i<12 ; i++){
            gMinRainfall[i] = Double.valueOf(rainfalls[i]);
        }
        if (gMinRainfall[0] < gMinRainfall[1]) {
            minRainfall = gMinRainfall[0];
        } else {
            minRainfall = gMinRainfall[1];
        }
        for(int i = 1; i<12; i++){
            if(minRainfall>gMinRainfall[i]){
                minRainfall = gMinRainfall[i];
            }
        }
        return minRainfall;
    }
    
    public Double getMaxSunhours(){
        Double maxSunhours;
        Double[] gMaxSunhours = new Double[12];
        for(int i = 0; i<12 ; i++){
            gMaxSunhours[i] = Double.valueOf(sunHours[i]);
        }
        if (gMaxSunhours[0] > gMaxSunhours[1]) {
            maxSunhours = gMaxSunhours[0];
        } else {
            maxSunhours = gMaxSunhours[1];
        }
        for(int i = 1; i<12; i++){
            if(maxSunhours<gMaxSunhours[i]){
                maxSunhours = gMaxSunhours[i];
            }
        }
        return maxSunhours;
    }
    
    public Double getMinSunhours(){
        Double minSunhours;
        Double[] gMinSunhours = new Double[12];
        for(int i = 0; i<12 ; i++){
            gMinSunhours[i] = Double.valueOf(sunHours[i]);
        }
        if (gMinSunhours[0] < gMinSunhours[1]) {
            minSunhours = gMinSunhours[0];
        } else {
            minSunhours = gMinSunhours[1];
        }
        for(int i = 1; i<12; i++){
            if(minSunhours>gMinSunhours[i]){
                minSunhours = gMinSunhours[i];
            }
        }
        return minSunhours;
    }
    
    public Double getAvgTemp(){
        Double avgTemp;
        avgTemp = (getMaxTemp()+getMinTemp())/2;
        return Math.ceil(avgTemp);
    }
    
    public Double getAvgMaxTemp(){
        Double avgMaxTemp = 0.0;
        for(int i = 0; i<12 ; i++){
            avgMaxTemp = avgMaxTemp+Double.valueOf(maxTemps[i]);
        }
        avgMaxTemp = avgMaxTemp/12;
        return Math.ceil(avgMaxTemp);
    }
    
    public Double getAvgMinTemp(){
        Double avgMinTemp = 0.0;
        for(int i = 0; i<12 ; i++){
            avgMinTemp = avgMinTemp+Double.valueOf(minTemps[i]);
        }
        avgMinTemp = avgMinTemp/12;
        return Math.ceil(avgMinTemp);
    }
    
    public double getAvgAirfost(){
        Double avgAirfrost = 0.0;
        for(int i = 0; i<12 ; i++){
            avgAirfrost = avgAirfrost+Double.valueOf(airFrosts[i]);
        }
        avgAirfrost = avgAirfrost/12;
        return Math.ceil(avgAirfrost);
    }
    
    public double getAvgRainfall(){
        Double Rainfall = 0.0;
        for(int i = 0; i<12 ; i++){
            Rainfall = Rainfall+Double.valueOf(rainfalls[i]);
        }
        Rainfall = Rainfall/12;
        return Math.ceil(Rainfall);
    }
    
    public double getAvgSunhours(){
        Double sunhours = 0.0;
        for(int i = 0; i<12 ; i++){
            sunhours = sunhours+Double.valueOf(sunHours[i]);
        }
        sunhours = sunhours/12;
        return Math.ceil(sunhours);
    }
    
//    public static void main(String args[]){
//        WeatherYear w = new WeatherYear(1961,"17.3,22.4,2.4,4,6.7,11.4,12.14,11,9,10,23,50.4","-2.3,1.3,2.4,4,6.7,11.4,12.3,11.9,9.7,7.5,4.3,2.3","11,2,1,0,0,0,0,0,0,0,3,17","101.2,60.2,32.1,62.4,64.4,49.8,86.9,106.9,86.9,106.9,86.9,97.3","35.6,61.2,125.4,94.3,166.8,197.1,157.2,161.7,144.5,118.3,73.5,55.2");
//        System.out.println(w.getMaxRainfall());
//        System.out.println(w.getMinSunhours());
//        System.out.println(w.getAvgSunhours());
//        
//    }
}
