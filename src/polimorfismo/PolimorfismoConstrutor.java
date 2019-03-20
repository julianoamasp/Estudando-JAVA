package polimorfismo;

/**
 *
 * @author JULIANO
 */
public class PolimorfismoConstrutor {
    /*
    Contrutor
    Smpre tem o mesmo nome da classe
    não podem terem retorno
    Diferente dos métodos normais um método construtor não pode ser chamado
diretamente; ao invés disto os métodos construtores são chamados automaticamente pelo
Java. No momento em que o objeto é instanciado, ou seja quando se usa new o Java faz três
coisas
    Aloca memória para o objeto
    Inicializa as variáveis daquela instância do objeto
    Chama o método construtor da classe
    */
    String modelo;
    String cor;
    String itemDeSerie;
    
    public PolimorfismoConstrutor(String modelo, String cor){
        this.modelo = modelo;
        this.cor = cor;
    }
    public PolimorfismoConstrutor(String modelo, String cor, String itemDeSerie){
        this.modelo = modelo;
        this.cor = cor;
        this.itemDeSerie = itemDeSerie;
    }
    
    public static void main(String arga[]){
        PolimorfismoConstrutor caro1 = new PolimorfismoConstrutor("Fiat", "Preto");
        PolimorfismoConstrutor carro2 = new PolimorfismoConstrutor("Fiat", "Branco", "Ar");
    }
}
