package array;

public class Objeto {
    private String nome;
    private String raca;
    
    public Objeto(String nome, String raca){
        this.nome = nome;
        this.raca = raca;
    }
    
    public String barulho(){
        return "au au au";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    
    
}
