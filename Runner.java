import edu.galileo.baquiax.Comunicador;
import edu.galileo.baquiax.Sumador;
import edu.galileo.baquiax.Restador;

public class Runner {
    public static void main(String args[]) {
        Comunicador c = new Comunicador();
        Sumador s = new Sumador(c);
        Restador r = new Restador(c);
        Thread sumador = new Thread(s);
        Thread restador = new Thread(r);
        sumador.start();
        restador.start(); 
    }
}