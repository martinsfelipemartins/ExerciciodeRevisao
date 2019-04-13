package br.com.alunodh;

public class Aula {

   private Materia materia;
    private int horarioIn;
    private int horarioOut;

    public Aula(){

    }
    public Aula(Materia novoMateria, int novoHorarioIn, int novoHorarioOut){

        horarioIn=novoHorarioIn;
        horarioOut=novoHorarioOut;
        materia=novoMateria;

    }


    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia novoMateria) {
        materia = novoMateria;
    }

    public int getHorarioIn() {
        return horarioIn;
    }

    public void setHorarioIn(int novoHorarioIn) {
       horarioIn = novoHorarioIn;
    }

    public int getHorarioOut() {
        return horarioOut;
    }

    public void setHorarioOut(int novoHorarioOut) {
        horarioOut = novoHorarioOut;
    }
}
