package Operacoesbasicas.carrinhodecompras;

public class Item {
    //attrib
    private String descricao;

    public Item(String descricao) {
        this.descricao = descricao;
    }

    public String getdescricao() {
        return descricao;
    }
    public String toString(){
        return descricao;
    }
}
