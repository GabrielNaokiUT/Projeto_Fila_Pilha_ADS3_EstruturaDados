public class Pilha {
    No topo = null;
    int cont = 0;
    
    public void empilhar(String valor) {
        cont++;
        No p = new No();
        p.setDado(valor);
        
        if(topo == null){
            topo = p;
            p.setProximo(null);
            System.out.println("Não há livros na pilha de livros");
        } else {
            p.setProximo(topo);
            topo = p;
        }
    }

    public No desempilhar() {
        cont--;
        No aux = topo;
        topo = topo.getProximo();
        return aux;
    }

    public void consultar(){
        No aux = topo;
        if(aux == null) {
            System.out.println("A pilha está vazia");
        }
        
        while(aux != null) {
            System.out.println("Livro: " + aux.getDado());
            aux = aux.getProximo();
        }
    }

    public void verVazio() {
        No aux = topo;
        if(aux == null) {
            System.out.println("A pilha de livros está vazia");
        } else {
            System.out.println("Existem livros na pilha de livro");
        }
    }

    public void verProximo(){
        No aux = topo;
        if(aux == null) {
            System.out.println("Não há livros a serem lidos");
        } else {
            System.out.println("O proximo livro é " + aux.getDado());
        }
    }
}

