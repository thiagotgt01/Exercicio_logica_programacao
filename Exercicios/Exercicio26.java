/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios;

import java.util.Scanner;
public class Exercicio26 {
    public static void main(String [ ] args){
        Scanner leitor = new Scanner(System.in);
        
        int numeroPorExtenso;
        System.out.println("Digite um número de 1 a 5 para exibi-lo por extenso");
        numeroPorExtenso = leitor.nextInt();
        switch (numeroPorExtenso) {
            case 1:
                System.out.println("Um");
                break;
            case 2:
                System.out.println("Dois");
                break;
            case 3:
                System.out.println("Três");
                break;
            case 4:
                System.out.println("Quatro");
                break;
            case 5:
                System.out.println("Cinco");
                break;
            default:
                System.out.println("Por favor informe um numero entre 1 a 5");
        }
        
        
    }
}
