package condicionais;

public class While {
    public static void main(String args[]){
        /*mais usado quando não se sabe a quantidade necessaria de um array*/
        
        int[] numeros = {3, 5, 1, 2};
        int contador = 0;
        
        while(numeros.length > contador){
        System.out.println(numeros[contador]);
        contador++;
        }
    }
}
