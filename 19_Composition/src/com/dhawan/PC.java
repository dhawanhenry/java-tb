package com.dhawan;

public class PC {

    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard){
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public Case getTheCase(){
        return this.theCase;
    }

    public Monitor getMonitor(){
        return this.monitor;
    }

    public Motherboard getMotherboard(){
        return this.motherboard;
    }
}
