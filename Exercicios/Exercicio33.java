/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios;

import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args){
        
        Scanner leitor = new Scanner(System.in);
        int opcao,horas,aulas;
        char cont='s';
        while(cont == 's' || cont == 'S'){
            System.out.println("Escola APRENDER");
            System.out.println("Simulador de ordenado para docentes");
            System.out.println("Selecione o nível do professor ");
            System.out.println("1 - Professor Nível 1");
            System.out.println("2 - Professor Nível 2");
            System.out.println("3 - Professor Nível 3");
            opcao = leitor.nextInt();
            System.out.println("Quantas aulas foram ministradas nos últimos 30 dias ?");
            aulas = leitor.nextInt();
            System.out.println("Quantas horas por aula ?");
            horas = leitor.nextInt();

            switch(opcao){

                case 1:
                    System.out.println("Professor nível 1");
                    System.out.println("Dados dos últimos 30 dias");
                    System.out.println("Aulas: "+aulas+" total de horas: "+(aulas*horas));
                    System.out.println("Salário correspondente: "+(12*(aulas*horas))+" reais");
                    break;
                case 2:
                    System.out.println("Professor nível 2");
                    System.out.println("Dados dos últimos 30 dias");
                    System.out.println("Aulas: "+aulas+" total de horas: "+(aulas*horas));
                    System.out.println("Salário correspondente: "+(17*(aulas*horas))+" reais");
                    break;
                case 3:
                    System.out.println("Professor nível 3");
                    System.out.println("Dados dos últimos 30 dias");
                    System.out.println("Aulas: "+aulas+" total de horas: "+(aulas*horas));
                    System.out.println("Salário correspondente: "+(25*(aulas*horas))+" reais");
                    break;

                default:
                    System.out.println("Selecione uma opção valida");
            }
           System.out.println("Deseja realizar outra operação ? (S/N)");
           cont = leitor.next().charAt(0);
        }
    }
}
