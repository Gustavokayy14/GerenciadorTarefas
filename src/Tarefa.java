import java.util.Scanner;

public class Tarefa {
    private String titulo;
    private String desc;
    private boolean concluida;



    public Tarefa(String titulo, String desc) {
        this.titulo = titulo;
        this.desc = desc;
        this.concluida = false;
    }

    public void marcarComoConcluida() {
        this.concluida = true;
    }

    @Override
    public String toString(){
        return "Titulo: " + titulo + "\nDescriçaõ: " + desc + "\nConcluida: " + (concluida ? "Sim" : "nao");
    }




