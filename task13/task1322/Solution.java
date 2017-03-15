package com.javarush.task.task13.task1322;

/* 
Интерфейс SimpleObject
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        SimpleObject<String> stringObject = new StringObject<Object>();
    }

    interface SimpleObject<T>
    {
        SimpleObject<T> getInstance();
    }

    public static class StringObject<Object> /*I dont understand this one */ implements SimpleObject<String>
    {

        @Override
        public StringObject<String> getInstance()
        {
            return new StringObject<String>();
        }
    }

}
