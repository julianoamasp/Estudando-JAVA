package array;

public class Arrays {
    /*Arrays
    Arrays em Java são diferentes do que em outras linguagens. 
    Arrays em Java são objetos que podem ser passados e acoplados a outros objetos. 
    Arrays podem conter qualquer tipo de elemento valorado(tipos primitivos ou objetos), mas você não pode armazenar diferente tipos em um simples array. 
    Ou seja, você pode ter um array de inteiros, ou um array de strings, ou um y de array, mas você não pode ter um array que contenha ambos os objetos strings e inteiros. A restrição acima descrita significa que os arrays implementados em Java são genéricos homogêneos, ou seja, um único array pode armazenar qualquer tipo de objeto com a restrição que todos sejam do mesma */
    
    //Declarando um array
    String difficult[];
    Objeto hits[];
    int temp[];
    
    //outra alternativa de declaração
    String[] difficult2[];
    Objeto hits2[];
    int temp2[];
    
    //criando objetos arrays
    int[] temps = new int[99];
    
    /*quando se inicializa um array com a chave new, os indices são criados
    0 para arrays numéricos
    falso para boolean
    '\0' para carcteres
    null para objetos;
    */
    String[] carros = {"Omega", "Camaro", "Mustang", "Cherry"};

    //explicação simples pense em tabela [linha][conteudo]
    String[][] tabela = {{"nome","idade"},{"joao","35"}};
    
    //lembrando que todos tem um método
    Objeto[] cachorros = {new Objeto("Bernado", "São bernado"), new Objeto("Gilberto","Vira lata"), new Objeto("Felicia", "Pudle")};
    
    //acessando elemento no array, os arrays iniciam na posião 0
    public static void main (String args[]){
        //acessando um array comum
        Arrays arr = new Arrays();
        for (int i = 0; i < arr.carros.length; i++){
            System.out.println("Carro " + i + " " + arr.carros[i]);
        }
        //acessando um array multidimensional
        for (int a = 0; a < arr.tabela.length; a++){
            for (int i = 0; i < arr.tabela[a].length; i++){
                System.out.println(arr.tabela[a][i]);
            }
        }
        //acessando um array de objeto
        for (int i = 0; i < arr.cachorros.length; i++){
            System.out.println("Cachorro " + (i+1) + " Nome: " + arr.cachorros[i].getNome() + " Raça: " + arr.cachorros[i].getRaca() + " Barulho: " + arr.cachorros[i].barulho() );
        }
    }
}
