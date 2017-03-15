package com.javarush.task.task13.task1314;

import java.awt.*;

/* 
Класс BigFox
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Fox bigFox = new Fox();
        System.out.println(bigFox.getName());
        System.out.println(bigFox.getColor());

    }

    public interface Animal {
        Color getColor();
    }

    public static  class Fox implements Animal {
        public String getName() {
            return "Fox";
        }

        @Override
        public Color getColor() {
            return null;
        }
    }

    public static class BigFox implements Animal{

        public String getName() {
            return "Fox";
        }
        @Override
        public Color getColor() {
            return Color.GRAY;
        }
    }

}
