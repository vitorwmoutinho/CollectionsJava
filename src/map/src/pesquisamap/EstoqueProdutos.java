package pesquisamap;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long,Produto> estoqueProduto;

    public EstoqueProdutos() {
        this.estoqueProduto = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProduto.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProduto);

    }
    public double calcularValorTotalEstoque(){
        double valotTotalEstoque = 0d;
        if(!estoqueProduto.isEmpty()){
            for(Produto p : estoqueProduto.values()){
                valotTotalEstoque += p.getQuantidade() * p.getPreco();

            }
        }
        return valotTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        
    }
}
