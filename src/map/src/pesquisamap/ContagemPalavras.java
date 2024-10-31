package pesquisamap;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> contagemPalavras;

    public ContagemPalavras() {
        this.contagemPalavras = new HashMap<>();
    }
    public void adicionarPalavra(String palavra){
        contagemPalavras.put(palavra);
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
        contagemPalavras.adicionarPalavra("Salto",2);
        contagemPalavras.adicionarPalavra("Servidão",3);
        contagemPalavras.adicionarPalavra("Salto",7);
        contagemPalavras.adicionarPalavra("Salto",6);
        contagemPalavras.adicionarPalavra("Salto",6);
        contagemPalavras.adicionarPalavra("Carro",1);
        contagemPalavras.exibirContagemPalavras();

    }

}
