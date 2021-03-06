/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Data.WeatherYear;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Mike
 */
public class WeatherGUI extends javax.swing.JFrame {
    private Scanner inputFile;
    private String Year, Month, MaxT, MinT, AirF, Rain, Sun, space;
    private DefaultListModel weatherList;
    private ArrayList<String> years = new ArrayList();
    private int weatherYear;
    private String[] weatherYearMaxTemp = new String[12];
    private String[] weatherYearMinTemp = new String[12];
    private String[] weatherYearAirfrost = new String[12];
    private String[] weatherYearRainfall = new String[12];
    private String[] weatherYearSunhours = new String[12];
    String weatherYearMaxTempsStats = "", weatherYearMinTempStats = "", weatherYearAirfrostStats = "", weatherYearRainfallStats = "", weatherYearSunhoursStats= "";
    public WeatherYear w;
    /**
     * Creates new form WeatherGUI
     */
    public WeatherGUI() {
        initComponents();
    }
    public void openFile() {
        try {
            inputFile = new Scanner(new File("src/Data/RingWayWeather.txt"));
        } // end try
        catch (FileNotFoundException fileNotFoundException) {
            System.err.println(fileNotFoundException);
            System.exit(1);
        } // end catch
    } // end method openFile
    public void printRecords() {
        space = "          :            ";
        try // read records from file using Scanner object
        {
            weatherList.addElement("Year           Month            Max Temp            Min Temp            Air Frost            Rainfall            Sun Hours            ");
            while (inputFile.hasNext()) {
                Year = inputFile.next();
                Month = getMonthText(Integer.valueOf(inputFile.next()));
                MaxT = inputFile.next();
                MinT = inputFile.next();
                AirF = inputFile.next();
                Rain = inputFile.next();
                Sun = inputFile.next();
                if(!years.contains(Year)){
                    jComboBox1.addItem(Year);
                    years.add(Year);
                }
                
                weatherList.addElement(Year + "     :      " + Month + space + MaxT + space + MinT + space + AirF + space + Rain + space + Sun + " ");
            } // end while
        } // end try
        catch (IllegalStateException stateException) {
            System.err.println(stateException);
            System.exit(1);
        } // end catch
    } // end method readRecords
    
    public void printRecords(int year) {
        space = "          :            ";
        weatherList.clear();
        try // read records from file using Scanner object
        {
            weatherList.addElement("Year           Month            Max Temp            Min Temp            Air Frost            Rainfall            Sun Hours            ");
            while (inputFile.hasNext()) {
                Year = inputFile.next();
                Month = getMonthText(Integer.valueOf(inputFile.next()));
                MaxT = inputFile.next();
                MinT = inputFile.next();
                AirF = inputFile.next();
                Rain = inputFile.next();
                Sun = inputFile.next();
                if(Integer.valueOf(Year)==year){
                    weatherList.addElement(Year + "     :      " + Month + space + MaxT + space + MinT + space + AirF + space + Rain + space + Sun + " ");
                }
            } // end while
        } // end try
        catch (IllegalStateException stateException) {
            System.err.println(stateException);
            System.exit(1);
        } // end catch
    } // end method readRecords
    
    private String getMonthText(int monthInt){
        String month = null;
        switch(monthInt){
            case(1): 
                month = "JAN";
                break;
            case(2): 
                month = "FEB";
                break;
            case(3): 
                month = "MAR";
                break;
            case(4): 
                month = "MAY";
                break;
            case(5): 
                month = "APR";
                break;
            case(6): 
                month = "JUN";
                break;
            case(7): 
                month = "JUL";
                break;
            case(8): 
                month = "AUG";
                break;
            case(9): 
                month = "SEPT";
                break;
            case(10): 
                month = "OCT";
                break;
            case(11): 
                month = "NOV";
                break;
            case(12): 
                month = "DEC";
                break;
        }
        return month;
    }
    /**
     * This method is called from within the constructor to initialise the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OpenFile = new javax.swing.JButton();
        BtnTempMax = new javax.swing.JButton();
        BtnTempAvg = new javax.swing.JButton();
        BtnTempMin = new javax.swing.JButton();
        LblTemp = new javax.swing.JLabel();
        LblAirF = new javax.swing.JLabel();
        LblRain = new javax.swing.JLabel();
        LblSun = new javax.swing.JLabel();
        BtnAirFMax = new javax.swing.JButton();
        BtnAirFAvg = new javax.swing.JButton();
        BtnAirFMin = new javax.swing.JButton();
        BtnRainMax = new javax.swing.JButton();
        BtnRainMin = new javax.swing.JButton();
        BtnRainAvg = new javax.swing.JButton();
        BtnSunMax = new javax.swing.JButton();
        BtnSunMin = new javax.swing.JButton();
        BtnSunAvg = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Weather");
        setMinimumSize(new java.awt.Dimension(834, 364));
        setResizable(false);

        OpenFile.setText("Open File");
        OpenFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OpenFileMouseClicked(evt);
            }
        });

        BtnTempMax.setText("Max");

        BtnTempAvg.setText("Min");

        BtnTempMin.setText("Average");

        LblTemp.setText("Temp");

        LblAirF.setText("Air Frost");

        LblRain.setText("Rain Fall");

        LblSun.setText("Sunshine");

        BtnAirFMax.setText("Max");

        BtnAirFAvg.setText("Min");

        BtnAirFMin.setText("Average");

        BtnRainMax.setText("Max");

        BtnRainMin.setText("Min");

        BtnRainAvg.setText("Average");

        BtnSunMax.setText("Max");

        BtnSunMin.setText("Min");

        BtnSunAvg.setText("Average");

        jList1.setModel(weatherList = new DefaultListModel());
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.setToolTipText("");
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jList1);

        jLabel1.setText("Year");

        jButton1.setText("Filter");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("Exit");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(142, 142, 142)
                        .addComponent(OpenFile)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField3)
                            .addComponent(jTextField2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblTemp)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(BtnTempMax, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(BtnTempAvg, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(BtnTempMin, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(BtnAirFMin)
                                .addComponent(BtnAirFMax)
                                .addComponent(LblAirF))
                            .addComponent(BtnAirFAvg, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(48, 48, 48)
                        .addComponent(jButton2)
                        .addGap(62, 62, 62)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextField8, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LblRain)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(BtnRainMin)
                        .addComponent(BtnRainAvg)
                        .addComponent(BtnRainMax)))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextField10, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField12, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(BtnSunAvg, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(BtnSunMax))
                    .addComponent(BtnSunMin)
                    .addComponent(LblSun))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(OpenFile)
                            .addComponent(jLabel1)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(LblSun)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(BtnSunMax)
                                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnSunAvg)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(BtnSunMin)
                                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(LblRain)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(BtnRainMax)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnRainAvg)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(BtnRainMin)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(LblAirF)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(BtnAirFMax)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(BtnAirFMin)
                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(BtnAirFAvg)
                                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(LblTemp)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(BtnTempMax)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(BtnTempMin)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(BtnTempAvg)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OpenFileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OpenFileMouseClicked
        openFile();
        printRecords();
    }//GEN-LAST:event_OpenFileMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        String[] monthStatsArray = new String[7];
        openFile();
        System.out.println(jComboBox1.getSelectedItem().toString());
        if(!jComboBox1.getSelectedItem().toString().isEmpty()){
            printRecords(Integer.valueOf(jComboBox1.getSelectedItem().toString()));
        } else {
            JOptionPane.showMessageDialog(rootPane, "Please select a year to filter");
        }
        String monthStats;
        for(int i = 0; i < 12; i++){
            monthStats = weatherList.getElementAt(i+1).toString();
            monthStats = monthStats.replaceAll(" ", "");
            monthStatsArray = monthStats.split(":");
            weatherYear = Integer.valueOf(monthStatsArray[0]);
            weatherYearMaxTemp[i] = monthStatsArray[2];
            weatherYearMinTemp[i] = monthStatsArray[3];
            weatherYearAirfrost[i] = monthStatsArray[4];
            weatherYearRainfall[i] = monthStatsArray[5];
            weatherYearSunhours[i] = monthStatsArray[6];
        }
        for(int i = 0; i < 12; i++){
            if(i==0){
                weatherYearMaxTempsStats = weatherYearMaxTempsStats + weatherYearMaxTemp[i];
                weatherYearMinTempStats = weatherYearMinTempStats + weatherYearMinTemp[i];
                weatherYearAirfrostStats = weatherYearAirfrostStats + weatherYearAirfrost[i];
                weatherYearRainfallStats = weatherYearRainfallStats + weatherYearRainfall[i];
                weatherYearSunhoursStats = weatherYearSunhoursStats + weatherYearSunhours[i];
            } else {
                weatherYearMaxTempsStats = weatherYearMaxTempsStats + ":" + weatherYearMaxTemp[i];
                weatherYearMinTempStats = weatherYearMinTempStats + ":" + weatherYearMinTemp[i];
                weatherYearAirfrostStats = weatherYearAirfrostStats + ":" + weatherYearAirfrost[i];
                weatherYearRainfallStats = weatherYearRainfallStats + ":" + weatherYearRainfall[i];
                weatherYearSunhoursStats = weatherYearSunhoursStats + ":" + weatherYearSunhours[i];
            }
        }
        System.out.println(weatherYearMaxTempsStats);
        w = new WeatherYear(weatherYear, weatherYearMaxTempsStats, weatherYearMinTempStats, weatherYearAirfrostStats, weatherYearRainfallStats, weatherYearSunhoursStats);
        System.out.println(w.getMaxTemp());
//        for(int i = 0; i < 12; i++){
//            monthStats[0] = weatherList.getElementAt(i).toString();
//            weatherYearMaxTemp[i] = ;
//        }
        weatherYearMaxTempsStats = "";
        weatherYearMinTempStats = "";
        weatherYearAirfrostStats = "";
        weatherYearRainfallStats = "";
        weatherYearSunhoursStats = "";
        
        //Set GUI boxes
        jTextField1.setText(String.valueOf(w.getMaxTemp()));
        jTextField2.setText(String.valueOf(w.getAvgTemp()));
        jTextField3.setText(String.valueOf(w.getMinTemp()));
        
        jTextField4.setText(String.valueOf(w.getMaxAirforst()));
        jTextField5.setText(String.valueOf(w.getAvgAirfost()));
        jTextField6.setText(String.valueOf(w.getMinAirforst()));
        
        jTextField7.setText(String.valueOf(w.getMaxRainfall()));
        jTextField8.setText(String.valueOf(w.getAvgRainfall()));
        jTextField9.setText(String.valueOf(w.getMinRainfall()));
        
        jTextField10.setText(String.valueOf(w.getMaxSunhours()));
        jTextField11.setText(String.valueOf(w.getAvgSunhours()));
        jTextField12.setText(String.valueOf(w.getMinSunhours()));
    }//GEN-LAST:event_jButton1MouseClicked

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        if(!jList1.isSelectionEmpty()){
            System.out.println(weatherList.getElementAt(jList1.getSelectedIndex()).toString().replace(" ", ""));
        } else {
            JOptionPane.showMessageDialog(rootPane, "Please select a valid month");
        }
    }//GEN-LAST:event_jList1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jButton2MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WeatherGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WeatherGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WeatherGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WeatherGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WeatherGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAirFAvg;
    private javax.swing.JButton BtnAirFMax;
    private javax.swing.JButton BtnAirFMin;
    private javax.swing.JButton BtnRainAvg;
    private javax.swing.JButton BtnRainMax;
    private javax.swing.JButton BtnRainMin;
    private javax.swing.JButton BtnSunAvg;
    private javax.swing.JButton BtnSunMax;
    private javax.swing.JButton BtnSunMin;
    private javax.swing.JButton BtnTempAvg;
    private javax.swing.JButton BtnTempMax;
    private javax.swing.JButton BtnTempMin;
    private javax.swing.JLabel LblAirF;
    private javax.swing.JLabel LblRain;
    private javax.swing.JLabel LblSun;
    private javax.swing.JLabel LblTemp;
    private javax.swing.JButton OpenFile;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
