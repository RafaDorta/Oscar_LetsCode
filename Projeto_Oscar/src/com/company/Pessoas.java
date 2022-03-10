package com.company;

public class Pessoas {

    private String filme;
    private String name;
    private Integer idade;
    private Integer ano;


    private String genero;



    public Pessoas(String name, Integer idade, String filme, Integer ano, String genero) {
        this.filme = filme;
        this.name = name;
        this.idade = idade;
        this.ano = ano;
        this.genero = genero;

    }
    public String getGenero() {
        return genero;
    }


    public String getNome(){
        return this.name;
    }

    public String getFilme(){
        return this.filme;
    }

    public Integer getIdade(){
        return this.idade;
    }

    public int getAno(){
        return this.ano;
    }

    public boolean eHomem(){if(genero == "MASCULINO"){ return true;}
        return false;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setFilme(String filme){
        this.filme = filme;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setAno(int ano){
        this.ano = ano;
    }


    public String toString(){
        return "—————————————————————————————————————————————————————————————————\n" +
        this.name + " | " + this.idade + " | " + this.filme + " | " + this.ano + "\n";
    }

    public void exibirInformacoes(){
        System.out.print(this.toString());
    }

    public String oscar(){
        return "\t" + this.ano + ", " + this.idade + ", " + this.filme + "\n";
    }

    public void exibirOscars(){
        System.out.print(this.oscar());
    }



}


