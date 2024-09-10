import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        Gerenciador gerenciador = new Gerenciador();


        while (true) {
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2 listar tarefa");
            System.out.println("3 Remover Tarefa");
            System.out.println("4 Marcar como concluida");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção:");
            int escolha = scanner.nextInt();
            scanner.nextLine();

            if (escolha == 1 ) {
                System.out.print("Título: ");
                String titulo = scanner.nextLine();
                System.out.print("Descrição: ");
                String descricao = scanner.nextLine();
                gerenciador.adicionarTarefa(titulo, descricao);
            } else if (escolha == 2) {
                gerenciador.listarTarefas();
            } else if (escolha == 3) {
                System.out.print("Número da tarefa para remover: ");
                int indice = scanner.nextInt() - 1;
                gerenciador.removerTarefa(indice);
            } else if (escolha == 4) {
                System.out.print("Número da tarefa para marcar como concluída: ");
                int indice = scanner.nextInt() - 1;
                gerenciador.marcarTarefaComoConcluida(indice);
            } else if (escolha == 5) {
                System.out.println("Encerrando o programa.");
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }

        scanner.close();
            }
        }


