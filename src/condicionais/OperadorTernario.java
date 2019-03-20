package condicionais;

public class OperadorTernario {
    /*
    Uma alternativa para o uso do if e else é um operador ternário condicional. 
    Este operador ternário (?: ) , é chamado assim porque tem três termos como parâmetro.
    Teste ? verdadeiro : falso;
    */
    
    public static void main(String args[]){
        int x = 3;
        int y = 4;        
        
        System.err.println(x > y ? "X maior que Y" : "Y maior que X");
    }
}
