package condicionais;

public class For {
    /*looping for é o mais usado, e temos tambem o for each aplicado para simplificar listas de objetos*/
    
    public static void main(String as[]){
        int[] numeros = {4, 5, 15, 544, 222, 1, 23, 44};
        
        for (int i = 0; i < numeros.length; i++){
            System.out.println("Modo \"for\": " + numeros[i]);
        }
        
        for (int n : numeros){
            System.out.println("Modo \"for each\": " + n);
        }
    }
}
