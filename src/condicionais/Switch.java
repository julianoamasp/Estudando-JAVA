package condicionais;

public class Switch {
    /*Um comum mecanismo para substituição de ifs que pode ser usado para um grupo
de testes e ações junto a um simples agrupamento, chama-se switch. 
    */
    public static void main(String args[]){
        int x = 15;
        switch (x){
            case 5: 
                System.out.println("X maior que 5");
                break;
            case 15: 
                System.out.println("X igual a 15");
                break;
            default:
                System.out.println("Não foi possivel o teste");
                break;
        }
    }
}
