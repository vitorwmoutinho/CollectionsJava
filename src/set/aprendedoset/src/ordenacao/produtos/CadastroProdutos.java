package ordenacao.produtos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(quantidade,preco,cod,nome));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }
    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new Produto.comparatorPorPreco());
       produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        System.out.println("Produtos");
        CadastroProdutos produtos = new CadastroProdutos();
        produtos.adicionarProduto(8878745,"vassoura",1.75,2);
        produtos.adicionarProduto(8878746,"maça",1.50,12);
        produtos.adicionarProduto(8878777,"fosforo",1.65,1);
        produtos.adicionarProduto(8878712,"vela",2.00,10);

        System.out.println(produtos.produtoSet);

        //System.out.println("Produtos adicionados por nome");
        //System.out.println(produtos.exibirProdutosPorNome());


        System.out.println("Produtos adicionados por preço");
        System.out.println(produtos.exibirProdutosPorPreco());
    }
}
