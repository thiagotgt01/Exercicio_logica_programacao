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
        System.out.println("Digite o primeiro n�mero inteiro");
        num1 = leitor.nextInt();
        System.out.println("Digite o segundo n�mero inteiro");
        num2 = leitor.nextInt();
        
        if(num1 > num2){
            System.out.println("O primeiro n�mero � maior que o segundo");
        }else if(num2 > num1){
            System.out.println("O segundo n�mero � maior que o primeiro");
        }else{
            System.out.println("Os n�meros possuem o mesmo valor");
        }
        
        
    }
}
