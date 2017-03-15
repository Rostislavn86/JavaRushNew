package com.javarush.task.task14.task1408;

import com.javarush.task.task14.task1406.Hen;

/**
 * Created by Rostislav on 15.03.2017.
 */
public class RussianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 22;
    }
    public String  getDescription()
    {
        return "Моя страна" + Country.RUSSIA + " я несу " + this.getCountOfEggsPerMonth();
    }
}
