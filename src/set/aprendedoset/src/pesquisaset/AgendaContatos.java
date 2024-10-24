package pesquisaset;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));

    }
    public void exibirContatos() {
        if (contatoSet.isEmpty()) {
            System.out.println("Agenda vazia");
        } else {
            System.out.println(contatoSet);
        }
    }
    public void pesquisarPorNome(String nome){
        Contato pesquisaNome = null;
        if(!contatoSet.isEmpty()){
            for(Contato c : contatoSet){
                if(c.getNome().equalsIgnoreCase(nome)){
                    pesquisaNome = c;
                    break;
                }
            }

        }
    }

    public void atualizarNumeroContato(String nome, int novoNumero) {
        contatoSet.add(new Contato(nome, novoNumero));
    }

    public static void main(String[] args){
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Pessoa 1", 88579);
        agendaContatos.adicionarContato("Pessoa 2", 88578);
        agendaContatos.adicionarContato("Pessoa 3", 88577);
        agendaContatos.adicionarContato("Pessoa 4", 88576);

        agendaContatos.exibirContatos();
        agendaContatos.pesquisarPorNome("Pessoa 1");


        
    }
}
