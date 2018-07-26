
package arvorebinaria;

import java.util.Scanner;

/**
 *
 * @author Marion
 */
public class ArvoreBinaria {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        System.out.println("Digite os valores separados por virgula : ");

        String entrada = teclado.nextLine(); // entrada dos dados

        String[] numeroString = entrada.split(","); //array que indica que os valores são separados por virgula

        int[] numero = new int[numeroString.length]; // declarando array 'numero' que terá o tamanho do 'numeroString'

        for (int i = 0; i < numeroString.length; i++) { // for para converter cada valor do vetor para inteiro

            numero[i] = Integer.parseInt(numeroString[i]); // convertendo as strings para inteiro
  
        }
        
        
        No raiz = new No(numero [0]);
    
        GerenciadorDeArvore gerenciador = new GerenciadorDeArvore();
        
        for (int i = 1; i < numero.length; i++) {
            
            gerenciador.addRecursive(raiz, numero[i]);
            
            
        }
        
        gerenciador.imprimir(raiz);
        
     
        
    }
    
 
}
