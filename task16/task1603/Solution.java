package com.javarush.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
Список и нити
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {

        SpecialThread obj1 = new SpecialThread();
        SpecialThread obj2 = new SpecialThread();
        SpecialThread obj3 = new SpecialThread();
        SpecialThread obj4 = new SpecialThread();
        SpecialThread obj5 = new SpecialThread();

        list.add(0,new Thread(obj1));
        list.add(1,new Thread(obj2));
        list.add(2,new Thread(obj3));
        list.add(3,new Thread(obj4));
        list.add(4,new Thread(obj5));
        //Add your code here - добавьте свой код тут
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
