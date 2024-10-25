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
    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatoPorNome = new HashSet<>();
        for(Contato c: contatoSet){
            if(c.getNome().startsWith(nome)){
                contatoPorNome.add(c);
            }
        }

        return contatoPorNome;
    }


    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;

    }

    public static void main(String[] args){
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Pessoa 1", 88579);
        agendaContatos.adicionarContato("Pessoa 1", 88578);
        agendaContatos.adicionarContato("Pessoa a", 00000);
        agendaContatos.adicionarContato("Pessoa a", 88577);
        agendaContatos.adicionarContato("Pessoa z", 88576);

        agendaContatos.exibirContatos();

        System.out.println("agendaContatos = " + agendaContatos.pesquisarPorNome("Pessoa 1"));

        agendaContatos.atualizarNumeroContato("Pessoa z", 2345678);

        agendaContatos.exibirContatos();


        
    }
}
