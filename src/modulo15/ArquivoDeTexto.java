package modulo15;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author JULIANO
 */
public class ArquivoDeTexto {
    private static Formatter output;
    public static void main(String args[]){
        abrirArquivo();
        adicionar();
        
    }
    //abre o arqvuio como texto
    public static void abrirArquivo(){
        try{
            output = new Formatter("teste.java");
        }
        catch (SecurityException se) {
            System.err.println("Write permission denied. Terminating.");
        }
        catch (FileNotFoundException fi){
            System.err.println("Error opening file. Terminating.");
        }
    }
    
    //adiciona os registros ao arqvuivo
    public static void adicionar(){
        Scanner input = new Scanner(System.in);
        System.out.printf("%s%n%s%n?","entrar com a conta, primeiro nome, utimo nome e balanço","entra com o end point");
        
        while(input.hasNext()){
            output.format("%d %s %s %.2f%n", input.nextInt(), input.next(), input.next(), input.nextDouble());
        }
        System.out.println("? ");
    }
    
}
