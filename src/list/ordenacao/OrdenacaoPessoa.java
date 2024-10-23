package ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    // Atributo
    private List<Pessoa> pessoaList;

    // Construtor que recebe uma lista
    public OrdenacaoPessoa(List<Pessoa> pessoaList) {
        this.pessoaList = new ArrayList<>(pessoaList); // Inicializando a lista com a lista fornecida
    }

    // Construtor padrão
    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>(); // Inicializando a lista
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorIdade);
        return pessoaPorIdade; // Retornar a lista ordenada corretamente
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorAltura, new ComparatorPorAltura()); // Usar o Comparator personalizado
        return pessoaPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Nome 1", 20, 1.56);
        ordenacaoPessoa.adicionarPessoa("Nome 2", 30, 1.80);
        ordenacaoPessoa.adicionarPessoa("Nome 3", 25, 1.70);
        ordenacaoPessoa.adicionarPessoa("Nome 4", 17, 1.56);

        System.out.println("Ordenação por idade:");
        for (Pessoa p : ordenacaoPessoa.ordenarPorIdade()) {
            System.out.println(p);
        }

        System.out.println("Ordenação por altura:");
        for (Pessoa p : ordenacaoPessoa.ordenarPorAltura()) {
            System.out.println(p);
        }
    }
}
