/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios;

import java.util.Scanner;

public class Exercicio35 {
    public static void main(String [] args){
        Scanner leitor = new Scanner(System.in);
        float kilowatt;
        int opcao;
        char cont='s';
        
        while(cont == 's' || cont == 'S'){
            System.out.println("Calculadora de consumo elétrico");
            System.out.println("Informe a quantidade de kilowatts(KW) consumidos");
            kilowatt = leitor.nextFloat();
            System.out.println("Informe a designação do imóvel");
            System.out.println("1 - Residência");
            System.out.println("2 - Comércio");
            System.out.println("3 - Indústria");
            opcao = leitor.nextInt();

            switch(opcao){
                case 1:
                    System.out.println("Residência Selecionado");
                    System.out.println("Valor a pagar: "+(0.60*kilowatt));
                    break;
                case 2:
                    System.out.println("Comércio Selecionado");
                    System.out.println("Valor a pagar: "+(0.48*kilowatt));
                    break;
                case 3:
                    System.out.println("Indústria Selecionado");
                    System.out.println("Valor a pagar: "+(1.29*kilowatt));
                    break;
                default:
                    System.out.println("Designação inválida");

            }
            System.out.println("Deseja realizar outra operação ? (S/N)");
            cont = leitor.next().charAt(0);
        }
        
    }
}
