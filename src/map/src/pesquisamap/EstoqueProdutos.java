package pesquisamap;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long,Produto> estoqueProduto;

    public EstoqueProdutos() {
        this.estoqueProduto = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        estoqueProduto.put(cod, new Produto(nome,preco,quantidade));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProduto);

    }
    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0;
        for (Produto p : estoqueProduto.values()) {
            valorTotalEstoque += p.getQuantidade() * p.getPreco();
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        for (Produto p : estoqueProduto.values()) {
            if (p.getPreco() > maiorPreco) {
                produtoMaisCaro = p;
                maiorPreco = p.getPreco();
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        for (Produto p : estoqueProduto.values()) {
            if (p.getPreco() < menorPreco) {
                produtoMaisBarato = p;
                menorPreco = p.getPreco();
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto maiorQuantidadeValor = null;
        double maiorValorTotal = 0;
        for (Produto p : estoqueProduto.values()) {
            double valorTotal = p.getPreco() * p.getQuantidade();
            if (maiorQuantidadeValor == null || valorTotal > maiorValorTotal) {
                maiorQuantidadeValor = p;
                maiorValorTotal = valorTotal;
            }
        }
        return maiorQuantidadeValor;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        estoqueProdutos.exibirProdutos();

        estoqueProdutos.adicionarProduto(1L,"Produto A", 5.0, 10);
        estoqueProdutos.adicionarProduto(2L,"Produto B", 10.0, 5);
        estoqueProdutos.adicionarProduto(3L,"Produto C", 15.0, 2);

        estoqueProdutos.exibirProdutos();
        System.out.println("valor Total estoque: "+ estoqueProdutos.calcularValorTotalEstoque());
    }
}
