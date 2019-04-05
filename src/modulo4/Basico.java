package modulo4;

import java.util.Scanner;

/**
 *
 * @author JULIANO
 */
public class Basico {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite usuário!");
        String nome = in.next();
        
        System.out.println("Digite senha!");
        String senha = in.next();
        
        if(nome.equals("admin") && senha.equals("admin")){
            System.out.println("Entrou");        
        }else {
             System.out.println("Usuário não encontrado!");
        }
    }
}
