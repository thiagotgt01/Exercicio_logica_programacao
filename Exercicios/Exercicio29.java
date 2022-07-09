/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios;

import java.util.Scanner;
public class Exercicio29 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int numMes;
        System.out.println("Digite o número correspondente aos meses do ano \n 1 à 12");
        numMes = leitor.nextInt();
        switch(numMes){
            case 1:
                System.out.println("Mês de Janeiro");
                break;
            case 2:
                System.out.println("Mês de Fevereiro");
                break;
            case 3:
                System.out.println("Mês de Março");
                break;
            case 4:
                System.out.println("Mês de Abril");
                break;
            case 5:
                System.out.println("Mês de Maio");
                break;
            case 6:
                System.out.println("Mês de Junho");
                break;
            case 7:
                System.out.println("Mês de Julho");
                break;
            case 8:
                System.out.println("Mês de Agosto");
                break;
            case 9:
                System.out.println("Mês de Setembro");
                break;
            case 10:
                System.out.println("Mês de Outubro");
                break;
            case 11:
                System.out.println("Mês de Novembro");
                break;
            case 12:
                System.out.println("Mês de Dezembro");
                break;
            default:
                System.out.println("Informe um mês válido!");
        }
    }
}
