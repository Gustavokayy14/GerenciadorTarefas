import java.util.ArrayList;

public class Gerenciador {
    private ArrayList<Tarefa> tarefas = new ArrayList<>();

    public void adicionarTarefa (String titulo, String desc) {
        Tarefa tarefa = new Tarefa(titulo, desc);
        tarefas.add(tarefa);
    }

    public void listarTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma Tarefa Disponivel");
        } else {
            for (int i = 0; i <tarefas.size(); i++) {
                System.out.println("Tarefa" + (i+1) + ":");
                System.out.println(tarefas.get(i).toString());
                System.out.println();
            }
        }
    }

    public void removerTarefa(int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            tarefas.remove(indice);
            System.out.println("Tarefa removida");
        }else {
            System.out.println("Indice invalido");
        }

    }

    public void marcarTarefaComoConcluida(int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            tarefas.get(indice).marcarComoConcluida();
            System.out.println("Tarefa marcada como concluida");
        } else {
            System.out.println("Indice invalido");
        }
    }
}
