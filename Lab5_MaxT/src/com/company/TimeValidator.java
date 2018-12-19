package com.company;

public class TimeValidator {
    public static void ConvertTimeObj (String str) throws TimeException
    {

        String[] mas = new String[2];
        mas = str.split(":");

        double temp = 0, temp2 = 0;
        try {
            temp = Double.parseDouble(mas[0]);
            temp2 = Double.parseDouble(mas[1]);
        } catch (NumberFormatException num_ex)
        {
            try {
                throw new TimeException("", num_ex);
            }
            catch (TimeException time_ex)
            {
              System.out.println("");
            }

        }


    }
}
