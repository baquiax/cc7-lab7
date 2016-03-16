package edu.galileo.baquiax;

public class Comunicador {
    private int x;
    
    public Comunicador() {
        this.x = 0;
    }    
    
    public synchronized int sumar() throws InterruptedException {
        int r = ++this.x;
        this.notifyAll();
        return r;
    }
    
    public synchronized int restar() throws InterruptedException{
        if (this.x < 1)
            this.wait();
                       
        int r = --this.x;
        return r;
    }        
}