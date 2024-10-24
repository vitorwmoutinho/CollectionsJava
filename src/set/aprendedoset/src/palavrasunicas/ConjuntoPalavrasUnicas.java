package palavrasunicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    //Atributo
    private Set<String> palavrasUnicas;


    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicas = new HashSet<>();
    }


    public void adicionarPalavra(String palavra) {
        if (palavrasUnicas.add(palavra)) {
            System.out.println("Palavra '" + palavra + "' adicionada ao conjunto.");
        } else {
            System.out.println("A palavra '" + palavra + "' já está no conjunto.");
        }
    }


    public void removerPalavra(String palavra) {
        if (palavrasUnicas.remove(palavra)) {
            System.out.println("Palavra '" + palavra + "' removida do conjunto.");
        } else {
            System.out.println("A palavra '" + palavra + "' não está presente no conjunto.");
        }
    }


    public boolean verificarPalavra(String palavra) {
        return palavrasUnicas.contains(palavra);
    }


    public void exibirPalavrasUnicas() {
        if (palavrasUnicas.isEmpty()) {
            System.out.println("O conjunto de palavras únicas está vazio.");
        } else {
            System.out.println("Palavras únicas no conjunto:");
            for (String palavra : palavrasUnicas) {
                System.out.println(palavra);
            }
        }
    }


    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas();

        conjunto.adicionarPalavra("Java");
        conjunto.adicionarPalavra("Python");
        conjunto.adicionarPalavra("Java");
        conjunto.adicionarPalavra("C++");

        conjunto.exibirPalavrasUnicas();

        conjunto.removerPalavra("Python");
        conjunto.exibirPalavrasUnicas();

        System.out.println("A palavra 'Java' está no conjunto? " + conjunto.verificarPalavra("Java"));
        System.out.println("A palavra 'Ruby' está no conjunto? " + conjunto.verificarPalavra("Ruby"));
    }
}
