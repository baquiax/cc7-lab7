package edu.galileo.baquiax;

public class Restador extends RandomGenerator implements Runnable  {
    private Comunicador comunicador;
    
    public Restador(Comunicador c) {
        super();
        this.comunicador = c;
    }
    
    @Override
    public void run() {
        try {
            for (char i = 0; i < 100; i++) {            
                System.out.println("Thread Resta: " + this.comunicador.restar());
                Thread.sleep(getRandomNumber(1,5) * 1000);
            }   
        } catch (Exception e) {
            System.out.println(e.getStackTrace());    
        }        
    }
}