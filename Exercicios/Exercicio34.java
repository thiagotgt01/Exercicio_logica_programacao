/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios;

import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int idade;
        char categoria='z',opcao='s';
        
        while(opcao == 's' || opcao == 'S'){
            System.out.println("Categorizador de faixa etária para nadadores");
            System.out.println("Informe a idade ");
            idade = leitor.nextInt();

            if(idade >= 5 && idade <= 7){
                categoria = 'a';
            }else if(idade >= 8 && idade <= 10){
                categoria = 'b';
            }else if(idade >= 11 && idade <= 13){
                categoria = 'c';
            }else if(idade >= 14 && idade <= 17){
                categoria = 'd';
            }else if(idade >= 18 && idade <= 25){
                categoria = 'e';
            }

            switch(categoria){
                case 'a':
                    System.out.println("Nadador classificado como Infantil A");
                    break;
                case 'b':
                    System.out.println("Nadador classificado como Infantil B");
                    break;
                case 'c':
                    System.out.println("Nadador classificado como Juvenil A");
                    break;
                case 'd':
                    System.out.println("Nadador classificado como Juvenil B");
                    break;
                case 'e':
                    System.out.println("Nadador classificado como Sênior");
                    break;
                default:
                    System.out.println("Idade fora da faixa etária");
            }
            System.out.println("Deseja realizar outra operação ?(S/N)");
            opcao = leitor.next().charAt(0);
        }
        
    }
}
