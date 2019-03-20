package condicionais;

public class DoWhile {
    public static void main(String args[]){
          
        int[] numeros = {3, 5, 1, 2};
        int contador = 0;
        
        do{
        System.out.println(numeros[contador]);
        contador++;
        }while(numeros.length > contador);
    }
}
