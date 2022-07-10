/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios;

import java.util.Scanner;
public class Exercicio31 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        
        float valueA=0,valueB=0;
        char valueC,opcao='s';
        while(opcao == 's' || opcao == 'S'){
        System.out.println("-----------------------");
        System.out.println("Calculadora aritmétrica");
        System.out.println("-----------------------");
        System.out.println("Informe o 1° valor");
        valueA = leitor.nextFloat();
        System.out.println("Infome o 2° valor");
        valueB = leitor.nextFloat();
        System.out.println("Informe o operador");
        System.out.println(" + - Adição");
        System.out.println(" - - Subtração");
        System.out.println(" * - Multiplicação");
        System.out.println(" / - Divisão");
        System.out.println(" % - Módulo");
        valueC = leitor.next().charAt(0);
        
            switch(valueC){
                case '+':
                    System.out.println("Soma");
                    System.out.println(valueA +" + "+valueB+" = "+(valueA+valueB));
                    break;
                case '-':
                    System.out.println("Subtração");
                    System.out.println(valueA +" - "+valueB+" = "+(valueA-valueB));
                    break;
                case '*':
                    System.out.println("Multiplicação");
                    System.out.println(valueA +" * "+valueB+" = "+(valueA*valueB));
                    break;
                case '/':
                    if(valueB == 0){
                        System.out.println("Divisão");
                        System.out.println(valueA +" / "+valueB+" = Não é possível dividir por zero");
                        
                        break;
                    }else{
                    System.out.println("Divisão");
                    System.out.println(valueA +" / "+valueB+" = "+(valueA/valueB));
                    break;
                    }
                case '%':
                    System.out.println("Módulo");
                    System.out.println(valueA +" % "+valueB+" = "+(valueA%valueB));
                    break;
                default:
                    System.out.println("Operador aritmético inválido");
            }
            
            
            System.out.println("Deseja realizar outra operação ? (S/N)");
            opcao = leitor.next().charAt(0);
        }
    }
}
