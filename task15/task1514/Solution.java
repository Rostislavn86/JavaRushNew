package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики 1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static
    {
        labels.put(1.2,"22");
        labels.put(1.3,"33");
        labels.put(1.4,"44");
        labels.put(1.5,"55");
        labels.put(1.6,"66");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
