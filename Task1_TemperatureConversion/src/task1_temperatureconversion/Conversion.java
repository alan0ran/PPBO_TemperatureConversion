/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task1_temperatureconversion;

/**
 *
 * @author radiv
 */

public class Conversion {
    public double Fahrenheit(double C){
        double F = (9 * C )/5 + 32;   
        return F;
    }
    
    public double Kelvin(double C){
        double K = (C + 273.15);
        return K;
    }
     
        
    public double Reamur(double C){
        double R = (4 * C)/5;
        return R;
    }
    
    public void Status(double C){
        if(C <= 0){
            System.out.print("Freeze");
            //status = "Freeze";
        }else if(C >= 100){
            System.out.print("Boiling");
            //status = "Boilling";
        }else{
            System.out.print("Normal");
            //status = "Normal";
        }
    }
}
