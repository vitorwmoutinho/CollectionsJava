package pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
//attrib
    private List<Livro> LivroList;

    public CatalogoLivros(){ this.LivroList = new ArrayList<>();}


    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        LivroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!LivroList.isEmpty()){
            for(Livro l : LivroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }

        }
        return livrosPorAutor;
    }

    public List<Livro>pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livroPorIntervalosAnos = new ArrayList<>();
        if(!LivroList.isEmpty()){
            for(Livro l : LivroList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livroPorIntervalosAnos.add(l);
                }
            }
        }
        return livroPorIntervalosAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulos = null;
        if(!LivroList.isEmpty()) {
            for (Livro l : LivroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulos = l;
                    break;
                    }
                }
            }
        return livroPorTitulos;
    }



    public static void main(String[] args){
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2021);
        catalogoLivros.adicionarLivro("Livre 2", "Autor 2", 2022);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 1994);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));


    }

























}