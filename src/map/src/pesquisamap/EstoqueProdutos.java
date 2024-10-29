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
        double maiorPreco = Double.MIN_VALUE;
        if(!estoqueProduto.isEmpty()){
            for(Produto p : estoqueProduto.values()){
                if(p.getPreco() >= maiorPreco){
                    produtoMaisCaro = p;
                    }
                }
            }
        return produtoMaisCaro;
    }
    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if(!estoqueProduto.isEmpty()){
            for(Produto p: estoqueProduto.values()){
                if(p.getPreco() >= menorPreco){
                    produtoMaisBarato = p;
                }
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto maiorQuantidadeValor = null;
        double maiorValorTotal = 0;
        for(Produto p: estoqueProduto.values()){
            double valorTotal = p.getPreco() * p.getQuantidade();
            if(maiorQuantidadeValor == null || valorTotal> maiorValorTotal){
                maiorQuantidadeValor = p;
                maiorValorTotal = valorTotal;
            }
        }
        return maiorQuantidadeValor;
    }

}
