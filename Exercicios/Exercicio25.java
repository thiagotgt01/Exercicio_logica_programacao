/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios;

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int num1,num2;
        
        System.out.print("Informe o primeiro numero: ");
        num1 = leitor.nextInt();
        System.out.print("Informe o segundo numero: ");
        num2 = leitor.nextInt();
        
        if(num1 == num2){
            System.out.println("Os numeros sao iguais");
        }else if(num1 != num2){
            System.out.println("Os numeros sao diferentes");
            if(num1 > num2){
                System.out.println("O primeiro digito é maior que o segundo");
            }else if(num2 > num1){
                System.out.println("O segundo digito é maior que o primeiro");
            }
        }
        
    }
}
