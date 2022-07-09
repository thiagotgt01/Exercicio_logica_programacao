/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios;

import java.util.Scanner;
public class Exercicio15 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        
        int num;
        System.out.println("Informe um número");
        num = leitor.nextInt();
        
        if((num >=100) && (num<=200)){
            System.out.println("O número informa está entre 100 e 200");
        }
    }
}
