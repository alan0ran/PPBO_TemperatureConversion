/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task1_temperatureconversion;

import java.util.Scanner;

/**
 *
 * @author radiv
 */

public class Main {
    public static void main(String[] args) {
        double C;
        int option;
        Conversion convert = new Conversion();
        
        System.out.println("+--------------------------------------+");
        System.out.println("| WATER TEMPERATURE CONVERSION PROGRAM |");
        System.out.println("+--------------------------------------+");
        do{
            System.out.println("\nData Entry");
            System.out.println("----------");
            Scanner input = new Scanner(System.in);

            System.out.print("Temperature in Celcius : ");
            C = input.nextInt();
            do{
                System.out.println("\nOption");
                System.out.println("------");
                System.out.println("1. View Conversion Data");
                System.out.println("2. Edit Conversion Data");
                System.out.println("3. Exit");
                System.out.print("Choose : ");
                option = input.nextInt();

                if(option == 1){
                    System.out.println("Temperature In Celsius : " + C + "°C");
                    System.out.println("In Fahrenheit : " + convert.Fahrenheit(C) + "°F");
                    System.out.println("In Reamur : " + convert.Reamur(C) + "°R");
                    System.out.println("In Kelvin : " + convert.Kelvin(C) + "°K");
                    
                    System.out.print("Water Condition ");
                    convert.Status(C);
                    System.out.print(".\n");
                    
                }else if(option != 2 && option != 3){
                    System.out.println("\nOption does not exist. Please enter the options correctly!\n");
                }
            }while(option == 1);
        }while(option == 2 || option != 3);
    }
}
