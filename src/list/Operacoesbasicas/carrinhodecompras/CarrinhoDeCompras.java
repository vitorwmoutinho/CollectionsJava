package list.Operacoesbasicas.carrinhodecompras;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itens;


    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }


    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        itens.add(item);
        System.out.println("Item adicionado: " + nome);
    }

    public void RemoverItem(String nome){
        Iterator<Item> iterator = itens.iterator();
        boolean itemRemovido = false;
        while (iterator.hasNext()){
            Item item = iterator.next();
            if (item.getNome().equalsIgnoreCase(nome)){
                iterator.remove();
                System.out.println("Item removido " + nome);
                itemRemovido  = true;
                break;
            }
        }
        if (!itemRemovido){
            System.out.println("Item não encontrado" + nome);
        }
    }
    public double calcularValortotal(){
        double total = 0.0;
        for (Item item : itens){
            total += item.calcularValorTotal();
        }
        return total;
    }

    public void exibirItens() {
        if (itens.isEmpty()) {
            System.out.println("Carrinho está vazio");
        }else {
            System.out.println("Itens no carrinho: ");
            for(Item item: itens){
                System.out.println("Nome: "+ item.getNome());
            }
        }

    }
    public static void main(String[] args){
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("Camisa", 50.0, 2);
        carrinho.adicionarItem("Calça", 80.0, 1);
        carrinho.adicionarItem("Tênis", 120.0, 1);

        carrinho.exibirItens();

        System.out.println("Valor total: R$" + carrinho.calcularValortotal());

        carrinho.RemoverItem("Calça");

        carrinho.exibirItens();

        System.out.println("Valor atualizado: R$ "+ carrinho.calcularValortotal());
    }
}

