package br.com.alunodh;

public class Curso {

    private String nome;
    private String[] conjuntoDeAulas;
    private String[] listaDeAlunos;
    private String professorResponsavel;

    public Curso(String novoNome, String[] novoConjuntoDeAulas, String[] novoListaDeAlunos, String novoProfessorResponsavel) {
        nome = novoNome;
        listaDeAlunos = novoListaDeAlunos;
        professorResponsavel = novoProfessorResponsavel;
        conjuntoDeAulas = novoConjuntoDeAulas;
    }

    public Curso() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String[] getConjuntoDeAulas() {
        return conjuntoDeAulas;
    }

    public void setConjuntoDeAulas(String[] conjuntoDeAulas) {
        this.conjuntoDeAulas = conjuntoDeAulas;
    }

    public String[] getListaDeAlunos() {
        return listaDeAlunos;
    }

    public void setListaDeAlunos(String[] listaDeAlunos) {
        this.listaDeAlunos = listaDeAlunos;
    }

    public String getProfessorResponsavel() {
        return professorResponsavel;
    }

    public void setProfessorResponsavel(String professorResponsavel) {
        this.professorResponsavel = professorResponsavel;
    }
}
