/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios;
import java.util.Scanner;
/**
 *
 * @author thiag
 */
public class Exercicio14 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        
        int num1, num2;
        System.out.println("Digite o primeiro número inteiro");
        num1 = leitor.nextInt();
        System.out.println("Digite o segundo número inteiro");
        num2 = leitor.nextInt();
        
        if(num1 > num2){
            System.out.println("O primeiro número é maior que o segundo");
        }else if(num2 > num1){
            System.out.println("O segundo número é maior que o primeiro");
        }else{
            System.out.println("Os números possuem o mesmo valor");
        }
        
        
    }
}
