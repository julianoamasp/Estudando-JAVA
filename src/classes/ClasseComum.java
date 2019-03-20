package classes;

//nome da classe sempre com a primeira letra maiuscula, e para extender de uma classe tem que usar o extends
 class ClasseComum extends ArrayIndexOutOfBoundsException{
    //variaveis de instancias são aquelas que serão iniciadas quando o objeto será criado
     String nome;
     //variaveis de classe, bom para a comunicação de diferentes classes e manter travamendo de estados globais de um conjunto de objetos
     static int soma;
     static final int MAXIMOBJETOS = 10;
     
     /*definição de método
        tipoDeAcesso tipoDoRetorno nomeDoMetodo(tipo1 argumento1...){};
        o this sai do contexto local para abranger toda classe
     */
     public String dizerOi(String seuNome){
         return "Olá" + seuNome;
     }
     
     
}
