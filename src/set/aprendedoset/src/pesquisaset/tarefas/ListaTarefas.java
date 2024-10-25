package pesquisaset.tarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }
    public void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        tarefaSet.removeIf(t -> t.getDescricao().equalsIgnoreCase(descricao));
    }
    public void exibirTarefas(){
        if(tarefaSet.isEmpty()){
            System.out.println("sem tarefas.");
        }else {
            System.out.println(tarefaSet);
        }
    }
    public void contarTarefas(){
        tarefaSet.size();
    }
    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> concluidas = new HashSet<>();
        for (Tarefa tarefa : tarefaSet) {
            if (tarefa.isConcluida()) {
                concluidas.add(tarefa);
            }
        }
        return concluidas;
    }
    public Set<Tarefa> obterTarefaPendente(){
        Set<Tarefa> pendente = new HashSet<>();
        for(Tarefa tarefa : tarefaSet){
            if(!tarefa.isConcluida()){
                pendente.add(tarefa);

            }
        }
    return pendente;
    }
    public void marcarTarefaConcluida(String descricao){
        for(Tarefa tarefa : tarefaSet){
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefa.setConcluida(true);
                break;
            }
        }
    }
    public void marcarTarefaPendente(String descricao){
        for(Tarefa tarefa : tarefaSet){
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefa.setConcluida(false);
                break;
            }
        }
    }
    public void limparListaTarefas(){
        tarefaSet.clear();
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 2");

        System.out.println("Todas as tarefas");
        listaTarefas.exibirTarefas();


        System.out.println("Tarefas concluidas");
        listaTarefas.marcarTarefaConcluida("Tarefa 1");
        System.out.println(listaTarefas.obterTarefasConcluidas());

        System.out.println("Tarefas não concluidas");
        listaTarefas.marcarTarefaPendente("Tarefa 2");
        System.out.println(listaTarefas.obterTarefaPendente());

        System.out.println("Todas as tarefas");
        listaTarefas.removerTarefa("Tarefa 1");
        listaTarefas.exibirTarefas();

        System.out.println("Removendo todas as tarefas");
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();






    }

}
