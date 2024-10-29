package operaçõesbasicasMap;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionariomap;

    public Dicionario() {
        this.dicionariomap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        dicionariomap.put(palavra, definicao);
    }
    public void removerPalavra(String palavra){
        if(dicionariomap.isEmpty()){
            dicionariomap.remove(palavra);
        }
    }
    public void exibirPalavras(){
        System.out.println(dicionariomap);
    }
    public void pesquisarPorPalavra(String palavra){
        String palavraPorNome = null;
        if(!dicionariomap.isEmpty()){

        }
    }

}
