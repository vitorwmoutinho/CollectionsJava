package ordenacao.listaalunos;

import java.util.*;


public class GerenciadorAlunos {
    private Set<Aluno> alunos;

    public GerenciadorAlunos() {
        this.alunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media) {
        alunos.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula) {
        alunos.removeIf(a -> a.getMatricula().equals(matricula));
    }

    public void exibirAlunosPorNome() {
        List<Aluno> alunosOrdenados = new ArrayList<>(alunos);
        alunosOrdenados.sort(Comparator.comparing(Aluno::getNome));
        System.out.println("Alunos em ordem alfabética pelo nome:");
        for (Aluno aluno : alunosOrdenados) {
            System.out.println(aluno);
        }
    }

    public void exibirAlunosPorNota() {
        List<Aluno> alunosOrdenados = new ArrayList<>(alunos);
        alunosOrdenados.sort(Comparator.comparingDouble(Aluno::getMedia));
        System.out.println("Alunos em ordem crescente de nota:");
        for (Aluno aluno : alunosOrdenados) {
            System.out.println(aluno);
        }
    }

    public void exibirAlunos() {
        System.out.println("Lista completa de alunos:");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }

    // Classe interna para representar o aluno
    static class Aluno {
        private String nome;
        private Long matricula;
        private double media;

        public Aluno(String nome, Long matricula, double media) {
            this.nome = nome;
            this.matricula = matricula;
            this.media = media;
        }

        public String getNome() {
            return nome;
        }

        public Long getMatricula() {
            return matricula;
        }

        public double getMedia() {
            return media;
        }

        @Override
        public String toString() {
            return "Aluno{nome='" + nome + "', matrícula=" + matricula + ", média=" + media + "}";
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Aluno aluno = (Aluno) o;
            return matricula.equals(aluno.matricula);
        }

        @Override
        public int hashCode() {
            return matricula.hashCode();
        }
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciador = new GerenciadorAlunos();

        gerenciador.adicionarAluno("Ana", 12345L, 8.5);
        gerenciador.adicionarAluno("Bruno", 23456L, 7.2);
        gerenciador.adicionarAluno("Carlos", 34567L, 9.1);

        System.out.println("\nTodos os Alunos:");
        gerenciador.exibirAlunos();

        System.out.println("\nAlunos Ordenados por Nome:");
        gerenciador.exibirAlunosPorNome();

        System.out.println("\nAlunos Ordenados por Nota:");
        gerenciador.exibirAlunosPorNota();

        gerenciador.removerAluno(23456L);
        System.out.println("\nApós remover o aluno com matrícula 23456:");
        gerenciador.exibirAlunos();
    }
}