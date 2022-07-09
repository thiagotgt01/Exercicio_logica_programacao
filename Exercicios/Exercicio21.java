/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios;

import java.util.Scanner;
public class Exercicio21 {
    public static void main(String[] args){
        
        Scanner leitor = new Scanner(System.in);
        
        String nome,sexo,saude,opcao="S";
        int idade,pessoasExaminadas=0,pessoasAptas=0;
        
        while((opcao.equals("S")) || (opcao.equals("s"))){
        System.out.println("-- Sistema de aptidão militar--");
        System.out.println("Nome:");
        nome = leitor.nextLine();
        System.out.println("Sexo: (M/F) ");
        sexo = leitor.next();
        System.out.println("Possui doenças crônicas ? (S/N)");
        saude = leitor.next();
        System.out.println("Idade:");
        idade = leitor.nextInt();
        
        if((("N".equals(saude)) || "n".equals(saude)) 
                && idade >= 18){
            pessoasAptas += 1;
            
        }
        
        
        
        System.out.println("Deseja examinar outro candidato ? (S/N)");
        opcao = leitor.next();
        pessoasExaminadas += 1;
        }
        System.out.println("Ao total foram examinadas "+pessoasExaminadas +" sendo "+pessoasAptas+" aptas ao serviço militar");
        
        
        
    }
}
