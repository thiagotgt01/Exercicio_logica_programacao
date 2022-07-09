/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args){
        Scanner leitor  = new Scanner(System.in);
        
        float deposito,correcaoMensal = 0.07f;
        System.out.println(" --- Banco global depositos --- ");
        System.out.println("Informe o valor do deposito para a conta");
        deposito = leitor.nextFloat();
        System.out.println("Valor com a aplicação da correcao fixa "+(deposito+(deposito*correcaoMensal)));
        
    }
}
