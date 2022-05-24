package com.learningjavapackage;

public class ConvertInchesToCM {
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet<0 || inches<0 || inches>12){
            return -1;
        }
        else {
            return 2.54*((feet*12)+inches);
        }
    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches>=0){
            return calcFeetAndInchesToCentimeters((int)(inches/12),(inches%12));
        }
        else
            return -1;
    }
}
