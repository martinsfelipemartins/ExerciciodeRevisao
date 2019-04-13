package br.com.alunodh;

public class Aluno {


    private String nome;
    private String sobreNome;
    private String ra;


    public Aluno(String novoNome, String novoSobreNome, String novoRa){
        nome=novoNome;
        sobreNome=novoSobreNome;
        ra=novoRa;
    }
    public Aluno(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String novoNome) {
        nome = novoNome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String novoSobreNome) {
        sobreNome = novoSobreNome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String novoRa) {
        ra = novoRa;
    }


    public void assistirAulas(){

}

    public void fazerLicoes(){

    }


}
