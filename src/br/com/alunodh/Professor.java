package br.com.alunodh;

public class Professor implements Docente{

  private  String nome;
  private String rD;

  public Professor(String novoNome, String novoRD){
      nome=novoNome;
      rD=novoRD;
  }




    public String getNome() {
        return nome;
    }

    public void setNome(String novoNome) {
         nome = novoNome;
    }

    public String getrD() {
        return rD;
    }

    public void setrD(String novoRD) {
        rD = novoRD;
    }


    @Override
    public void darAulas() {

    }

    @Override
    public void fazerChamada() {

    }
}
