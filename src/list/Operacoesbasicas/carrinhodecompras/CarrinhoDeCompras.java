import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itens;


    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }
    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
        itens.add(item);
        System.out.println("item adicionado: "+ nome);

    }

}
