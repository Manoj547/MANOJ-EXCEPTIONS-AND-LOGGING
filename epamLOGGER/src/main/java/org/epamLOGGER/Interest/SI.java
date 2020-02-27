package org.epamLOGGER.Interest;


public class SI extends Interest{
    public SI(int principle, int rate, int time) {
        super(principle, rate, time);
    }
    public double calcSI()
    {
        double retVal=principle*rate*time;
        return (retVal/100.0);
    }
}