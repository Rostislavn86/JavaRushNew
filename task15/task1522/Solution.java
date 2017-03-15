package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Закрепляем Singleton pattern
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    static
    {
        readKeyFromConsoleAndInitPlanet();

    }

    //add static block here - добавьте статический блок тут

    public static void readKeyFromConsoleAndInitPlanet() {

        BufferedReader reade;
        reade = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            //System.out.print("Введите a: ");
            String s = reade.readLine();
            if (s.equals(Planet.EARTH)||s.equals(Planet.MOON)||s.equals(Planet.SUN))
            {
                if (Planet.EARTH.equals("earth")) Earth.getInstance();
                if (Planet.MOON.equals("moon")) Moon.getInstance();
                if (Planet.SUN.equals("sun")) Sun.getInstance();
                //System.out.println("Bingo");
                else
                {}
            }
            else
            {

            }

        }
        catch (IOException e) {
            System.out.println("IO Error !!! ");
        }



        // implement step #5 here - реализуйте задание №5 тут
    }
}
