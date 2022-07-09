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
public class Exercicio2 {
    
    public static void main(String[] args){
    Scanner leitor = new Scanner(System.in);
    
    int numero1,numero2;
    
    System.out.println("digite o primeiro numero");
    numero1 = leitor.nextInt();
    System.out.println("digite o segundo numero");
    numero2 = leitor.nextInt();
    
    System.out.println("Valor da soma -> "+(numero1+numero2));
    System.out.println("Valor da subtracao -> "+(numero1-numero2));
    System.out.println("Valor da multiplicacao -> "+(numero1*numero2));
    System.out.println("Valor da divisao -> "+(numero1/numero2));
    
    }
}
