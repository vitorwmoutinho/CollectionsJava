package pesquisamap;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> contagemPalavras;

    public ContagemPalavras() {
        this.contagemPalavras = new HashMap<>();
    }
    public void adicionarPalavra(String palavra, Integer contagem){
        contagemPalavras.put(palavra, contagem);
    }
    public void removerPalavra(String palavra){
        if(contagemPalavras.isEmpty()){
            contagemPalavras.remove(palavra);
        }
    }
    public void exibirContagemPalavras(){
        if(contagemPalavras.isEmpty()){
            System.out.println("Sem palavras");
        } else{
            System.out.println(contagemPalavras);
        }
    }
    public String encontrarPalavraMaisFrequente(){
        String palavraMaisfrequente = null;
        int maiorFrequencia = 0;
        for(String palavra : contagemPalavras.keySet()){
            int frequencia = contagemPalavras.get(palavra);
            if(frequencia > maiorFrequencia){
                palavraMaisfrequente = palavra;

            }
        }

        return palavraMaisfrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();
        contagemPalavras.exibirContagemPalavras();

    }

}
