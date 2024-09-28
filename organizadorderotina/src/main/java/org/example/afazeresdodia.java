package org.example;

public class afazeresdodia {
    private String nome;
    private int horario;

    public afazeresdodia(String nome,int horario) {
        this.horario = horario;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "neste horario"+ this.horario + "seu compromisso é:"+this.nome;
    }
    public void criadorderotinausuario(String nome , int horario){
        //TODO:

    }
}
