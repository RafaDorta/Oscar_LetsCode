package com.company;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main  {
    static List<Pessoas> pessoas = new ArrayList<Pessoas>();


    public static void main(String[] args) throws InterruptedException {
        String nome = null;
        int g = 100;
        Funcoes f = new Funcoes();
        Scanner input = new Scanner(System.in);
        String[] results = null;


        try (Scanner pointer = new Scanner(new File("oscar_age_male.csv"))) {
            pointer.nextLine();
            while (pointer.hasNext()) {
                results = pointer.nextLine().split("; ");
                pessoas.add(new Pessoas(results[3], Integer.parseInt(results[2]), results[4], Integer.parseInt(results[1]), "MASCULINO"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (Scanner pointer = new Scanner(new File("oscar_age_female.csv"))) {
            pointer.nextLine();
            while (pointer.hasNext()) {
                results = pointer.nextLine().split("; ");
                pessoas.add(new Pessoas(results[3], Integer.parseInt(results[2]), results[4], Integer.parseInt(results[1]), "FEMININO"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        int escolha;
        do {
            System.out.println("__________________________________________________________________________________________________");
            System.out.println("Qual função você quer testar?\n" +
                    "1)Quem foi o ator mais jovem a ganhar um Oscar?\n" +
                    "2)Quem foi a atriz que mais vezes foi premiada?\n" +
                    "3)Qual atriz entre 20 e 30 anos que mais vezes foi vencedora?\n" +
                    "4)Quais atores ou atrizes receberam mais de um Oscar? Elabore uma única estrutura contendo atores e atrizes.\n" +
                    "5)Quando informado o nome de um ator ou atriz, dê um resumo de quantos prêmios ele/ela recebeu e liste ano, \n" +
                    "idade e nome de cada filme pelo qual foi premiado(a).\n" +
                    "6)Sair;"+"\n->");
            escolha = input.nextInt();
            switch (escolha) {
                case 1:
                    f.funcao_1();
                    break;
                case 2:
                    f.funcao_2();
                    break;
                case 3:
                    f.funcao_3();
                    break;
                case 4:
                    f.funcao_4();
                    break;
                case 5:
                    f.funcao_5();
                    break;
                default:
                    break;

            }
            Thread.currentThread().sleep(5000);
        } while (escolha != 6);

    }



}

