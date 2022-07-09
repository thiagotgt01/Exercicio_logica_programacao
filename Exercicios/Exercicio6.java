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
public class Exercicio6 {
    
    
    
    public static void main (String [] args){
        Scanner leitor = new Scanner(System.in);
        
        String valorA,valorB,valorTemporario;
        System.out.println("Informe o valor A");
        valorA = leitor.nextLine();
        System.out.println("Informe o valor B");
        valorB = leitor.nextLine();
        System.out.println("Valor de A: "+valorA+" - Valor de B: "+valorB);
        
        valorTemporario = valorA;
        valorA = valorB;
        valorB = valorTemporario;
        
        System.out.println("troca de valores. valor A: "+valorA+" valorB: "+valorB);
        
        
        
    }
}
