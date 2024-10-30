package pesquisamap;

public class Palavras {
    private String palavra;
    private Integer contagem;

    public Palavras(String palavra, Integer contagem) {
        this.palavra = palavra;
        this.contagem = contagem;
    }

    public String getPalavra() {
        return palavra;
    }

    public Integer getContagem() {
        return contagem;
    }

    @Override
    public String toString() {
        return "Palavras{" +
                "palavra='" + palavra + '\'' +
                ", contagem=" + contagem +
                '}';
    }
}
