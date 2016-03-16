package edu.galileo.baquiax;

public class Sumador extends RandomGenerator implements Runnable {
    private Comunicador comunicador;    
    public Sumador(Comunicador c) {
        super();
        this.comunicador = c;        
    }
    
    @Override
    public void run() { 
        try {
            for(int i = 0; i < 100 ; i++) {                
                System.out.println("Thread Sumador: " + this.comunicador.sumar());
                Thread.sleep(getRandomNumber(1,5) * 1000);
            }    
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
        
    }            
}