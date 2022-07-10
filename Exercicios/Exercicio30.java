/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios;

import java.util.Scanner;
import java.util.Arrays;
public class Exercicio30 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int[] num = new int[3];

        System.out.println(" -- Ordenação númerica -- ");
        System.out.println("Insira 3 valores interios diferentes");
        for(int i=0;i < num.length;i++){
          
            System.out.println("Informe o "+(i+1)+"° número");
            num[i] = leitor.nextInt();
            
        }
        Arrays.sort(num);
        System.out.println("Números em ordem crescente");
        System.out.print("( ");
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+"  ");
        }
        System.out.print(")");
    }
}
