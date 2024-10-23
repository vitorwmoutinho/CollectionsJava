package list.Operacoesbasicas.list.ListaTarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //attrib
    private List<Tarefa> tarefalist;

    public ListaTarefa() {
        this.tarefalist = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefalist.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t: tarefalist){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);

            }
        }
        tarefalist.removeAll(tarefasParaRemover);
    }
    public int obterNumerototalarefas(){
        return tarefalist.size();
    }
    public void obterDescricoeTarefas(){
        System.out.println(tarefalist);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O numero de elementos: " + listaTarefa.obterNumerototalarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 1");
        System.out.println("O numero de elementos: " + listaTarefa.obterNumerototalarefas());

        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("O numero de elementos: " + listaTarefa.obterNumerototalarefas());

        listaTarefa.obterDescricoeTarefas();
    }
}
