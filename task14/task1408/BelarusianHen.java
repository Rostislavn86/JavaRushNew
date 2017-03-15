package com.javarush.task.task14.task1408;

import com.javarush.task.task14.task1406.Hen;

/**
 * Created by Rostislav on 15.03.2017.
 */
public class BelarusianHen extends Hen
{
    @Override
    public int getCountOfEggsPerMonth()
    {
        return 27;
    }
    public String getDescription() {

        return super.getDescription() + " Моя страна - "+ Country.BELARUS+". Я несу "+getCountOfEggsPerMonth() +" яиц в месяц.";

    }
}
