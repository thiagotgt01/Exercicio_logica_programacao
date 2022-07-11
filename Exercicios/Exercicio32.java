/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios;

import java.util.Scanner;


public class Exercicio32 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int ladoA,ladoB,ladoC;
        
        System.out.println("Informe o lado A do triângulo");
        ladoA = leitor.nextInt();
        System.out.println("Informe o lado B do triângulo");
        ladoB = leitor.nextInt();
        System.out.println("Informe o lado C do triângulo");
        ladoC = leitor.nextInt();
        
        if(ladoA+ladoB > ladoC && ladoA+ladoC > ladoB && ladoB+ladoC > ladoA){
            if(ladoA == ladoB && ladoA == ladoC){
               //Triângulo  Equilátero
               System.out.println("Os valores informados formam um triângulo Equilátero");
            }else if(ladoA == ladoB || ladoA == ladoC || ladoB == ladoC){
               //Triângulo Isósceles
               System.out.println("Os valores informados formam um triângulo Isósceles");
            }else{
               //Triângulo Escaleno
               System.out.println("Os valores informados formam um triângulo Escaleno");
            }
            
        }else{
            System.out.println("Os valores não formam um triângulo !");
        }
    }
}
