import java.util.Scanner;

public class MainPilha {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Pilha pilha = new Pilha();

        boolean menu = false;
        int opcao;
        String valor;

        do {
            System.out.println(
                "PILHA DE LIVROS" + "\n" +
                "--------------------" + "\n" +
                "[1] - Adicionar livro à pilha" + "\n" +
                "[2] - Finalizar leitura" + "\n" +
                "[3] - Mostrar pilha de livros" + "\n" +
                "[4] - Ver próximo da pilha" + "\n" +
                "[5] - Verificar se pilha está vazia" + "\n" +
                "[6] - Encerrar" + "\n" + "\n"
            );
            opcao = leia.nextInt();

            switch (opcao) {
                case 1: // Add na fila
                    System.out.println("Nome do livro a ser inserido: ");
                    leia.nextLine();
                    valor = leia.nextLine();
                    pilha.empilhar(valor);
                    break;
                case 2: // Retirar da fila
                    pilha.desempilhar();
                    break;
                case 3: // Exibir a fila
                    pilha.consultar();
                    break;
                case 4: // Ver proximo na fila
                    pilha.verProximo();
                    break;
                case 5: // Verificar se esta vazio
                    pilha.verVazio();
                    break;
                case 6: // Sair
                    System.out.println("Programa encerrado");
                    menu = true;
                    break;
                default:
                    break;
            }
        } while (menu == false);
    }    
}
