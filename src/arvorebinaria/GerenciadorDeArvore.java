package arvorebinaria;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Marion
 */
public class GerenciadorDeArvore {

    public No addRecursive(No Noatual, int valorParaInserir) {
        if (Noatual == null) {
            return new No(valorParaInserir);
        }

        if (valorParaInserir < Noatual.valor) {
            Noatual.esquerdo = addRecursive(Noatual.esquerdo, valorParaInserir);
        } else if (valorParaInserir > Noatual.valor) {
            Noatual.direito = addRecursive(Noatual.direito, valorParaInserir);
        } else {

            return Noatual;
        }

        return Noatual;
    }
    
    public void imprimir(No raiz) {
    if (raiz == null) {
        return;
    }
 
    Queue<No> nos = new LinkedList<>();
    nos.add(raiz);
 
    while (!nos.isEmpty()) {
 
        No no = nos.remove();
 
        System.out.print(" " + no.valor);
 
        if (no.esquerdo != null) {
            nos.add(no.esquerdo);
        }
 
        if (no.direito!= null) {
            nos.add(no.direito);
        }
    }
}

}
