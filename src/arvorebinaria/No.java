package arvorebinaria;

/**
 *
 * @author Marion
 */
public class No { // criação da classe que será o nó da árvore

    int valor; // valor inteiro que será recebido
    No direito; // variável direito do tipo 'No'
    No esquerdo; // variável esquerdo do tipo 'No'

    public No(int valor) { // construtor da classe 'No' que inicializa 'direito' e 'esquerdo' como null
        this.valor = valor;
        direito = null;
        esquerdo = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public No getDireito() {
        return direito;
    }

    public void setDireito(No direito) {
        this.direito = direito;
    }

    public No getEsquerdo() {
        return esquerdo;
    }

    public void setEsquerdo(No esquerdo) {
        this.esquerdo = esquerdo;
    }

}
