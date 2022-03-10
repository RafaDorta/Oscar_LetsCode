package com.company;
import java.util.*;


public class Funcoes extends Main{

    Scanner input = new Scanner(System.in);
    public void funcao_1()
    {
        Optional<Pessoas> maisNovo = pessoas.stream().filter(pessoas1 -> pessoas1.eHomem()).min(Comparator.comparing(Pessoas::getIdade));
        System.out.println(maisNovo);

    }

    public void funcao_2()
    {
        long mais_vezes = 0;
        String nome = null;

        for(Pessoas c : pessoas){
            long ganhou = pessoas.stream().filter(pessoas1 -> (pessoas1.getNome().equals(c.getNome()) && !pessoas1.eHomem())).count();
                if(ganhou > mais_vezes)
                {
                    mais_vezes = ganhou;
                    nome = c.getNome();
                }
            }


        System.out.println(nome + " - "  + " ganhou " + mais_vezes + " vezes");
    }

    public void funcao_3()
    {
        long mais_vezes = 0;
        String nome = null;

        for(Pessoas c : pessoas){

            long ganhou = pessoas.stream().filter(pessoas1 -> (pessoas1.getNome().equals(c.getNome()) && pessoas1.getIdade() > 20 && pessoas1.getIdade() < 30)).count();            if(ganhou > mais_vezes)
            {
                mais_vezes = ganhou;
                nome = c.getNome();
            }


        }
        System.out.println(nome + " - "  + " ganhou " + mais_vezes + " vezes");
    }

    public void funcao_4()
    {
        List<String> p = new ArrayList<String>();

            for (Pessoas c : pessoas){
                long ganhou = pessoas.stream().filter(pessoas1 -> pessoas1.getNome().equals(c.getNome())).count();
                if(ganhou >= 2)
                {
                    p.add(c.getNome());
                }
            }

        p.stream().distinct().forEach(System.out::println);

    }

    public void funcao_5()
    {
        System.out.println("Digite o nome do ator/atriz:\n");
        final String nome = input.nextLine();
        Integer ganhou = 0;
        System.out.println(nome + ":\n->");
        for(Pessoas p : pessoas)
        {
            if(nome.compareTo(p.getNome()) == 0)
            {
                ganhou = ganhou +1;
                System.out.print(p.getFilme() + " - "+ p.getAno() + " - "+p.getIdade()+" Anos\n");
            }

        }

        System.out.println("Ganhou " + ganhou +" Oscar(s)");
    }

}


