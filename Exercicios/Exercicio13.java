/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios;
import java.util.Scanner;


public class Exercicio13 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        
        int num;
        System.out.println("Informe um número");
        num = leitor.nextInt();
        
        if(num > 10){
            System.out.println("O número informado é superior a '10'");
        }
        
    }
}
