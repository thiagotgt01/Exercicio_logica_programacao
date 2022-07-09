/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios;

import java.util.Scanner;
public class Exercicio23 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        
        int num;
        System.out.print("Informe um numero: ");
        num = leitor.nextInt();
        if(num > 80){
            System.out.print("numero maior que 80");
        }else if(num < 25){
            System.out.print("numero menor que 25");
        }else if(num == 40){
            System.out.print("numero igual a 40");
        }
                
    }
}
