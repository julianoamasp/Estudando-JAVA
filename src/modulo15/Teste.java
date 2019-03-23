package modulo15;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;
/**
 *
 * @author JULIANO
 */
public class Teste{
    /* tem 3 tipos de arquivo, binario, textual e objeto
    antigamente usava pacote io depois dojava 6 foi incluido mais facilidades com a biblioteca nio
     
    as interfaces path e directorstream e as classes paths e files todas da NIO
Interface Path — os objetos das classes que implementam essa interface representam o local de um arquivo ou diretório. Objetos
Path não abrem arquivos nem fornecem capacidades de processamento deles.
• Classe Paths — fornece os métodos static utilizados para obter um objeto Path representando um local de arquivo ou diretório.
• Classe Files — oferece os métodos static para manipulações de arquivos e diretórios comuns, como copiar arquivos; criar e
excluir arquivos e diretórios; obter informações sobre arquivos e diretórios; ler o conteúdo dos arquivos; obter objetos que permi-
tem manipular o conteúdo de arquivos e diretórios; e mais.
• Interface DirectoryStream — os objetos das classes que implementam essa interface possibilitam que um programa itere pelo
conteúdo de um diretório.
    */
    public static void main(String arga[])throws IOException{
        
        //usar sempre o file separator 
        String separador = File.separator;
        
        System.out.println("digite o nome do diretorio");
        //sem separator reconhecido somente no windows
        
        String tErrado = "C:\\Users\\JULIANO\\Documents\\loja.sql";
        //usando file separator aonde o java identifica o sistema operacional
        String t = "C:"+separador+"Users"+separador+"JULIANO"+separador+"Documents"+separador+"loja.sql";
        Path path = Paths.get(t);
    
        if (Files.exists(path)){
            System.out.println("Nome: "+path.getFileName());
            System.out.println("tamanho: "+Files.size(path));
        }
        if (Files.isDirectory(path)){
            DirectoryStream<Path> ds = Files.newDirectoryStream(path);
            for (Path p : ds){
                System.out.println(p);
            }
        }
        else {
            System.out.println("Arquivo ou pasta não existe!");
        }
            
            
 }
}
