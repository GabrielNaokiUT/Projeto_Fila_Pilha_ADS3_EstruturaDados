import java.util.Scanner;

public class MainFila {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Fila fila = new Fila();

        boolean menu = false;
        int opcao;
        String valor;

        do {
            System.out.println(
                "RESTAURANTE" + "\n" +
                "--------------------" + "\n" +
                "[1] - Adicionar pedido na fila" + "\n" +
                "[2] - Finalizar pedido" + "\n" +
                "[3] - Mostrar lista" + "\n" +
                "[4] - Ver próximo da fila" + "\n" +
                "[5] - Verificar se fila está vazia" + "\n" +
                "[6] - Encerrar" + "\n" + "\n"
            );
            opcao = leia.nextInt();

            switch (opcao) {
                case 1: // Add na fila
                    System.out.println("Digite o seu pedido:");
                    leia.nextLine();
                    valor = leia.nextLine();
                    fila.inserir(valor);
                    break;
                case 2: // Retirar da fila
                    fila.excluir();
                    break;
                case 3: // Exibir a fila
                    fila.consultar();
                    break;
                case 4: // Ver proximo na fila
                    fila.verProximo();
                    break;
                case 5: // Verificar se esta vazio
                    fila.verVazio();
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