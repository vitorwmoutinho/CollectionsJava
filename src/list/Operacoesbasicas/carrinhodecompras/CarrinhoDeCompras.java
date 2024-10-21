package Operacoesbasicas.carrinhodecompras;

import Operacoesbasicas.ListaTarefas.Tarefa;
import Operacoesbasicas.carrinhodecompras.Item;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    //atrib
    private List<Item> listaCarrinho;

    public CarrinhoDeCompras(){
        this.listaCarrinho = new ArrayList<>();
    }
    public void adicionarItem(String descricao){
        listaCarrinho.add(new Item(descricao));
    }
    public void removerItem(String descricao){
        List<Item> itemParaRemover = new ArrayList<>();
        for(Item t: listaCarrinho){
            if(t.getdescricao().equalsIgnoreCase(descricao)){
                itemParaRemover.add(t);

            }
        }
        itemParaRemover.removeAll(itemParaRemover);
    }
    public int calcularValorTotal(){
        return listaCarrinho.size();
    }
    public void obterDescricaoIem() {
        System.out.println(listaCarrinho);

    }

    public static void main(String[] args){
        CarrinhoDeCompras carrinhodecompras = new CarrinhoDeCompras();
        System.out.println("O numero de itens no carrinho: "+ )
    }


}
