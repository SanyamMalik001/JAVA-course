package com.learningjavapackage;

public class SecondsAndMinutesChallenge {
    public static String getDurationString(int minutes, int seconds){
        if(minutes<0 || seconds<0 || seconds>=59){
            return "Invalid Value";
        }
        else
            return (minutes/60+"h "+minutes%60+"m "+ seconds+"s");
    }
    public static String getDurationString(int seconds){
        if(seconds>=0)
            return (getDurationString(seconds/60,seconds%60));
        else
            return "Invalid Value";
    }
}
