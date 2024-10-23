package ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    //attrib
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa(List<Pessoa> pessoaList) {
        this.pessoaList = new ArrayList<>();

    }

    public void adicionarPessoa(String nome, int idade, double altura){
      pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorIdade);
        return pessoaList;
    }
    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
        return pessoaPorAltura;
    }
}

