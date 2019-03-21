package threads;

/**
 *
 * @author JULIANO
 */
public class Teste {
    /* force facilidades para a programação concorrente, pode ser definido como um fluxo de controle sequencia isolado dentro de um programa
    
    */
    
    public static void main(String args[]){
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.run();
        t2.run();
        Thread3 t3 = new Thread3();
        t3.start();
    }
}
