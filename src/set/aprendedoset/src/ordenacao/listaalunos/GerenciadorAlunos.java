package ordenacao.listaalunos;

import java.util.*;
public class GerenciadorAlunos {
    private Set<Aluno> alunos;

    public GerenciadorAlunos() {
        this.alunos = new HashSet<>();
    }
    public void adicionarAluno(String nome, Long matricula, double media){
        alunos.add(new Aluno(nome, matricula, media));

    }
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



}