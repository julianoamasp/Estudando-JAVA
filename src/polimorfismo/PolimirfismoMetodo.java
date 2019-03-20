package polimorfismo;

/**
 *
 * @author JULIANO
 */
public class PolimirfismoMetodo {
    /* Métodos pode ser sobrecarregados com o mesmo nome mas com diferentes assinaturas
    */
    public static String imprimirNome(String nome){
        return nome;
    }
    public static String imprimirNome(String nome, String sobreNome){
        return nome + " " + sobreNome;
    }
    public static String imprimirNome(String nome, String sobreNome, String utimoNome){
        return nome + " " + sobreNome + " " + utimoNome ;
    }
    
    public static void main(String args[]){

        System.out.println(PolimirfismoMetodo.imprimirNome("juliano"));
        System.out.println(PolimirfismoMetodo.imprimirNome("juliano", "Silva"));
        System.out.println(PolimirfismoMetodo.imprimirNome("juliano", "Silva", "Mendes"));
    }
}
