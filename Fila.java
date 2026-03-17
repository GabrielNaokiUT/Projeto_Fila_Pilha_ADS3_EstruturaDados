import java.util.Scanner;

public class Fila {
    No inicio = null;
    No fim = null;
    int cont = 0;
    String valor;

    public void inserir(String valor) {
        cont++;
        No p = new No();
        p.setDado(valor);

        if (inicio == null) {
            inicio = p;
            fim = p;
            p.setProximo(null);
            System.out.println("Primeiro pedido adicionado à fila!");
        } else {
            fim.setProximo(p);
            p.setProximo(null);
            fim = p;
        }
    }

    public void consultar() {
        No aux = inicio;

        if (aux == null) {
            System.out.println("A fila está vazia");
            return;
        }

        System.out.println("Quantidade de pedidos na fila: " + cont);
        while (aux != null) {
            System.out.println("Pedido: " + aux.getDado());
            aux = aux.getProximo();
        }
    }

    public void verVazio() {
        No aux = inicio;
        if (aux == null) {
            System.out.println("A fila está vazia");
        } else {
            System.out.println("A fila não está vazia");
        }
    }

    public void verProximo() {
        No aux = inicio;
        if (aux == null) {
            System.out.println("A fila está vazia");
        } else {
            System.out.println("O próximo pedido é: " + aux.getDado());
        }
    }

    public String excluir() {
        if (inicio == null) {
            System.out.println("A fila está vazia. Não é possível excluir.");
            return null;
        }

        No aux = inicio;

        if (aux == fim) {
            cont--;
            inicio = null;
            fim = null;
        } else {
            cont--;
            inicio = inicio.getProximo();
        }

        return aux.getDado();
    }
}
