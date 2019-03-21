package destrutor;

/**
 *
 * @author JULIANO
 */
public class Destrutora {
    /*
    
    Os métodos destrutores são chamados logo antes do “coletor de lixo” passar e sua
memória se liberada. O métodos destrutor é chamado de finalize() a classe Object define
um método destrutor padrão, que não faz nada. Para criar um método destrutor para suas
próprias classes basta sobrepor o método finalize () com o seguinte cabeçalho:
    
    */
    
    @Override
    protected void finalize() throws Throwable{
           super.finalize();
        
    }
}
