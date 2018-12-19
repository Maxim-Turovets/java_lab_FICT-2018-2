package com.company;

public class NoCorrectValidator {

    public  static  void Valid(boolean correct )
    {
        if(correct==false)
        {
            try {
                throw new NoCorrectNameException();
            }
            catch (NoCorrectNameException no_ex) {}

        }
    }
}
