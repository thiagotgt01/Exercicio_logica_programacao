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
public class Exercicio1 {
    
    public static void main(String args []){
        Scanner leitor = new Scanner(System.in);
        
        int numero1,numero2;
        
        System.out.println("digite o 1� numero");
        numero1 = leitor.nextInt();
        System.out.println("digite o 2� numero");
        numero2 = leitor.nextInt();
        
        System.out.println("Valor da soma dos numero �: "+(numero1+numero2));

    }
}
